package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AbsentTeacher {
    int id;
    String name, subject, day;
    
    String[] timeTable = new String[9];
    String[] chart = new String[9];
    String[] period = {"zero", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eight"};
    MySQLConnect MySQL = new MySQLConnect(ConnectionDetails.pass, ConnectionDetails.user, ConnectionDetails.databaseName);

    public AbsentTeacher(int id, String name, String subject, String classes, String day) {
        this.id = id;
        this.name = name;
        this.subject = subject;        
        this.day = day;       
        String query = "SELECT zero,first,second,third,fourth,fifth,sixth,seventh,eight "
                + "FROM timetbl WHERE day = '" + this.day +"' AND teach_id = " + this.id + " ;";
        
        ResultSet rs = MySQL.query(query);
        try {
            while(rs.next()){
                this.timeTable[0] = rs.getString("zero");
                this.timeTable[1] = rs.getString("first");
                this.timeTable[2] = rs.getString("second");
                this.timeTable[3] = rs.getString("third");
                this.timeTable[4] = rs.getString("fourth");
                this.timeTable[5] = rs.getString("fifth");
                this.timeTable[6] = rs.getString("sixth");
                this.timeTable[7] = rs.getString("seventh");
                this.timeTable[8] = rs.getString("eight");
            }             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"here");
        }
    }
    
    
    
    public void findTeachers(int period){
        String query1,query2,query3,query4;
        String classSec = this.timeTable[period];
        String classOnly = this.getClassOnly(this.timeTable[period]);
        String secOnly = this.getSecOnly(this.timeTable[period]);
        this.checkStatus(period);
        query1 = "SELECT teach_name FROM teachers WHERE status = 1 AND atendence = 1 AND  "
                + "classes LIKE '%("+ classSec +")%' ORDER BY RAND() LIMIT 1;";
        query2 = "SELECT teach_name FROM teachers WHERE status = 1 AND atendence = 1 AND "
                + "classes LIKE '%("+ classOnly +"_)%' AND subject = '"+this.subject+"' ORDER BY RAND() LIMIT 1;";
        query3 = "SELECT teach_name FROM teachers WHERE status = 1 AND atendence = 1 AND "
                + "subject = '"+this.subject+"' ORDER BY RAND() LIMIT 1;";
        query4 = "SELECT teach_name FROM teachers WHERE status = 1 AND atendence = 1 ORDER BY RAND() LIMIT 1;"; 
        
        
        try {
            String query;
            ResultSet rs1 = MySQL.query(query1);
            ResultSet rs2 = MySQL.query(query2);
            ResultSet rs3 = MySQL.query(query3);
            ResultSet rs4 = MySQL.query(query4);
            if(rs1.next()){
                this.setChart(period, rs1.getString("teach_name"));
                query = "UPDATE teachers Set status = 0 WHERE teach_name = '"+ rs1.getString("teach_name") +"';";
                MySQL.update(query);
                rs1.close();
            } else if(rs2.next()){
                this.setChart(period, rs2.getString("teach_name"));
                query = "UPDATE teachers Set status = 0 WHERE teach_name = '"+ rs2.getString("teach_name") +"';";                
                MySQL.update(query);
               
            } else if(rs3.next()){
                this.setChart(period, rs3.getString("teach_name"));
                query = "UPDATE teachers Set status = 0 WHERE teach_name = '"+ rs3.getString("teach_name") +"';";
                MySQL.update(query);
            } else if(rs4.next()){
                this.setChart(period, rs4.getString("teach_name"));
                query = "UPDATE teachers Set status = 0 WHERE teach_name = '"+ rs4.getString("teach_name") +"';";
                MySQL.update(query);
            } else {
                this.setChart(period, "PE");
                System.out.println("PE LAG ");
            }
        } catch (SQLException ex) {
            System.out.println(ex + "sfdsfd");
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    public void checkStatus(int i){        
        String query = "update teachers,timetbl set teachers.status=0 where teachers.id=timetbl.teach_id and timetbl."+this.period[i]+" is not null and day = '"+this.day+"';";
        MySQL.update(query);
    }
    
    public String getSecOnly(String s){        
        String secOnly = s.substring(s.length()-1);
        return secOnly;
    }
    
    public String getClassOnly(String s){
        String classOnly = s.substring(0, s.length()-2);        
        return classOnly;
    }
    
    public void setChart(int period,String substiTeachName){
        this.chart[period] = this.timeTable[period] + " " + substiTeachName;
    }
}