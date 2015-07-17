package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Execution {

    ArrayList<AbsentTeacher> absTeach = new ArrayList<AbsentTeacher>();
    MySQLConnect MySQL = new MySQLConnect(ConnectionDetails.pass, ConnectionDetails.user, ConnectionDetails.databaseName);

    public Execution(String absTeachersID, String Day) {
        MySQL.update("UPDATE teachers set atendence = 0 WHERE id IN(" + absTeachersID + ");");
        ResultSet rs = MySQL.query("SELECT id,teach_name,subject,classes FROM teachers WHERE atendence = 0;");
        try {
            while(rs.next()){
                int id = Integer.parseInt(rs.getString("id"));
                String name = rs.getString("teach_name");
                String subj = rs.getString("subject");
                String classes = rs.getString("classes");
                AbsentTeacher at = new AbsentTeacher(id, name, subj, classes, Day);
                absTeach.add(at);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        //Now All The Timetable and absteachers class is ready;
        
        this.createChart();
        this.DisplayChart();
    }
    
    private void createChart(){
        for(int i=0;i<=8;i++){
            for(AbsentTeacher abT : this.absTeach){
                if(abT.timeTable[i] != null){
                    abT.findTeachers(i);
                }
            }
            MySQL.update("UPDATE teachers SET status = 1;");
            MySQL.update("UPDATE teachers SET status = 0 WHERE id = 1;");
        }
        MySQL.update("UPDATE teachers SET atendence = 1;");
    }
    
    private void DisplayChart(){
        for(AbsentTeacher abT : this.absTeach){
            System.out.println(abT.name + " " + abT.chart[0] + " " + abT.chart[1] + " " + abT.chart[2] + " " + abT.chart[3] + " " + abT.chart[4] + " " + abT.chart[5] + " " + abT.chart[6] + " " + abT.chart[7] + " " + abT.chart[8]);
        }
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setSize(800,400);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.add(new DisplayPanel(this.absTeach));
    }
}