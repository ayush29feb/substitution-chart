package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class InsertData extends javax.swing.JFrame {
    MySQLConnect MySQL = new MySQLConnect(ConnectionDetails.pass, ConnectionDetails.user, ConnectionDetails.databaseName);
    
    public InsertData() {
        initComponents();
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cmb.getModel();
        String query = "SELECT * FROM teachers;";
        ResultSet rs = MySQL.query(query);
        try {
            while(rs.next()){
                dcbm.addElement(rs.getString("teach_name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        cmb.setModel(dcbm);
        resetFeilds();
    }
    
    public void getData(String name){
        try {
            String query = "SELECT subject,classes FROM teachers WHERE teach_name = '"+name+"' LIMIT 1;";
            ResultSet rs = MySQL.query(query);
            if(rs.next()){
                txtClasses.setText(rs.getString("classes"));
                txtSubj.setText(rs.getString("subject"));
                txtTeachName.setText(name);
            }
            query = "SELECT zero,first,second,third,fourth,fifth,sixth,seventh,eight "
                + "FROM timetbl,teachers WHERE day = 'monday' AND teach_name = '" + name + "' AND teachers.id = timetbl.teach_id;";
            rs = MySQL.query(query);
            while(rs.next()){
                m0.setText(rs.getString("zero"));
                m1.setText(rs.getString("first"));
                m2.setText(rs.getString("second"));
                m3.setText(rs.getString("third"));
                m4.setText(rs.getString("fourth"));
                m5.setText(rs.getString("fifth"));
                m6.setText(rs.getString("sixth")); 
                m7.setText(rs.getString("seventh")); 
                m8.setText(rs.getString("eight"));
            }             
            
            query = "SELECT zero,first,second,third,fourth,fifth,sixth,seventh,eight "
                + "FROM timetbl,teachers WHERE day = 'tuesday' AND teach_name = '" + name + "'  AND teachers.id = timetbl.teach_id;";
            rs = MySQL.query(query);
            while(rs.next()){
                tu0.setText(rs.getString("zero"));
                tu1.setText(rs.getString("first"));
                tu2.setText(rs.getString("second"));
                tu3.setText(rs.getString("third"));
                tu4.setText(rs.getString("fourth"));
                tu5.setText(rs.getString("fifth"));
                tu6.setText(rs.getString("sixth")); 
                tu7.setText(rs.getString("seventh")); 
                tu8.setText(rs.getString("eight"));
            }      
            query = "SELECT zero,first,second,third,fourth,fifth,sixth,seventh,eight "
                + "FROM timetbl,teachers WHERE day = 'wednesday' AND teach_name = '" + name + "' AND teachers.id = timetbl.teach_id ;";
            rs = MySQL.query(query);
            while(rs.next()){
                w0.setText(rs.getString("zero"));
                w1.setText(rs.getString("first"));
                w2.setText(rs.getString("second"));
                w3.setText(rs.getString("third"));
                w4.setText(rs.getString("fourth"));
                w5.setText(rs.getString("fifth"));
                w6.setText(rs.getString("sixth")); 
                w7.setText(rs.getString("seventh")); 
                w8.setText(rs.getString("eight"));
            }      
            query = "SELECT zero,first,second,third,fourth,fifth,sixth,seventh,eight "
                + "FROM timetbl,teachers WHERE day = 'thrusday' AND teach_name = '" + name + "' AND teachers.id = timetbl.teach_id ;";
            rs = MySQL.query(query);
            while(rs.next()){
                th0.setText(rs.getString("zero"));
                th1.setText(rs.getString("first"));
                th2.setText(rs.getString("second"));
                th3.setText(rs.getString("third"));
                th4.setText(rs.getString("fourth"));
                th5.setText(rs.getString("fifth"));
                th6.setText(rs.getString("sixth")); 
                th7.setText(rs.getString("seventh")); 
                th8.setText(rs.getString("eight"));
            }     
            query = "SELECT zero,first,second,third,fourth,fifth,sixth,seventh,eight "
                + "FROM timetbl,teachers WHERE day = 'friday' AND teach_name = '" + name + "' AND teachers.id = timetbl.teach_id ;";
            rs = MySQL.query(query);
            while(rs.next()){
                f0.setText(rs.getString("zero"));
                f1.setText(rs.getString("first"));
                f2.setText(rs.getString("second"));
                f3.setText(rs.getString("third"));
                f4.setText(rs.getString("fourth"));
                f5.setText(rs.getString("fifth"));
                f6.setText(rs.getString("sixth")); 
                f7.setText(rs.getString("seventh")); 
                f8.setText(rs.getString("eight"));
            }      
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"here ");
        }
    }

    public void resetFeilds(){
        m0.setText("");
        m1.setText("");
        m2.setText("");
        m3.setText("");
        m4.setText("");
        m5.setText("");
        m6.setText("");
        m7.setText("");
        m8.setText("");
        
        tu0.setText("");
        tu1.setText("");
        tu2.setText("");
        tu3.setText("");
        tu4.setText("");
        tu5.setText("");
        tu6.setText("");
        tu7.setText("");
        tu8.setText("");
        
        w0.setText("");
        w1.setText("");
        w2.setText("");
        w3.setText("");
        w4.setText("");
        w5.setText("");
        w6.setText("");
        w7.setText("");
        w8.setText("");
        
        th0.setText("");
        th1.setText("");
        th2.setText("");
        th3.setText("");
        th4.setText("");
        th5.setText("");
        th6.setText("");
        th7.setText("");
        th8.setText("");
        
        f0.setText("");
        f1.setText("");
        f2.setText("");
        f3.setText("");
        f4.setText("");
        f5.setText("");
        f6.setText("");
        f7.setText("");
        f8.setText("");
        
        txtClasses.setText("");
        txtSubj.setText("");
        txtTeachName.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTeachName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSubj = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtClasses = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        m0 = new javax.swing.JTextField();
        tu0 = new javax.swing.JTextField();
        w0 = new javax.swing.JTextField();
        th0 = new javax.swing.JTextField();
        f0 = new javax.swing.JTextField();
        m1 = new javax.swing.JTextField();
        f1 = new javax.swing.JTextField();
        th1 = new javax.swing.JTextField();
        w1 = new javax.swing.JTextField();
        tu1 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        f2 = new javax.swing.JTextField();
        th2 = new javax.swing.JTextField();
        w2 = new javax.swing.JTextField();
        tu2 = new javax.swing.JTextField();
        w3 = new javax.swing.JTextField();
        tu3 = new javax.swing.JTextField();
        f3 = new javax.swing.JTextField();
        th3 = new javax.swing.JTextField();
        m3 = new javax.swing.JTextField();
        w4 = new javax.swing.JTextField();
        tu4 = new javax.swing.JTextField();
        f4 = new javax.swing.JTextField();
        th4 = new javax.swing.JTextField();
        m4 = new javax.swing.JTextField();
        w5 = new javax.swing.JTextField();
        tu5 = new javax.swing.JTextField();
        f5 = new javax.swing.JTextField();
        th5 = new javax.swing.JTextField();
        m5 = new javax.swing.JTextField();
        w6 = new javax.swing.JTextField();
        tu6 = new javax.swing.JTextField();
        f6 = new javax.swing.JTextField();
        th6 = new javax.swing.JTextField();
        m6 = new javax.swing.JTextField();
        w7 = new javax.swing.JTextField();
        tu7 = new javax.swing.JTextField();
        f7 = new javax.swing.JTextField();
        th7 = new javax.swing.JTextField();
        m7 = new javax.swing.JTextField();
        w8 = new javax.swing.JTextField();
        tu8 = new javax.swing.JTextField();
        f8 = new javax.swing.JTextField();
        th8 = new javax.swing.JTextField();
        m8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        cmb = new javax.swing.JComboBox();
        editChk = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));

        jLabel1.setText("Name:");

        jLabel2.setText("Subject:");

        txtClasses.setColumns(40);
        txtClasses.setRows(2);
        jScrollPane1.setViewportView(txtClasses);

        jLabel3.setText("*Classes:");

        jLabel4.setText("*The Format in which the classes needs to filled is \"(<Class><Section>),..\"");

        jLabel5.setText("Monday");

        jLabel6.setText("Tuesday");

        jLabel7.setText("Wednesday");

        jLabel8.setText("Thrusday");

        jLabel9.setText("Friday");

        th0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th0ActionPerformed(evt);
            }
        });

        jLabel10.setText("0");

        jLabel11.setText("1");

        jLabel12.setText("2");

        jLabel13.setText("3");

        jLabel14.setText("4");

        jLabel15.setText("5");

        jLabel16.setText("6");

        jLabel17.setText("7");

        jLabel18.setText("8");

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        cmb.setEnabled(false);
        cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbActionPerformed(evt);
            }
        });

        editChk.setText("View/Edit Records");
        editChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editChkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(3, 3, 3))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(th0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(w0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tu0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(th1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tu1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(th2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(w2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tu2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(th3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(w3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tu3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(th4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(w4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tu4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(th5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(w5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tu5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(th6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(w6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tu6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(th7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(w7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tu7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(th8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(w8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tu8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel10)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel11)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel12)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel13)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel14)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel15)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel16)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel17)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(editChk)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTeachName, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)))
                                .addGap(196, 196, 196)
                                .addComponent(txtSubj, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editChk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTeachName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(m0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tu0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(w0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(th0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(f0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(th1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(w2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(th2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(w3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(th3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(w4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(th4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(w5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(th5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tu8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(w8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(th8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(w7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(th7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(w6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(th6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(submit)
                        .addComponent(reset)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        this.resetFeilds();
    }//GEN-LAST:event_resetActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(!editChk.isSelected()){
            MySQL.insert("teachers", "null,'"+txtTeachName.getText()+"','"+txtSubj.getText()+"','"+txtClasses.getText()+"',1,0");        
            try {
                ResultSet rs = MySQL.query("SELECT id FROM teachers WHERE teach_name = '"+ txtTeachName.getText() +"';");
                if(rs.next()){
                    int i = rs.getInt("id");
                    MySQL.insert("timetbl", "null,"+i+",'Monday','"+m0.getText()+"','"+m1.getText()+"','"+m2.getText()+"','"+m3.getText()+"','"+m4.getText()+"','"+m5.getText()+"','"+m6.getText()+"','"+m7.getText()+"','"+m8.getText()+"'");
                    MySQL.insert("timetbl", "null,"+i+",'Tuesday','"+tu0.getText()+"','"+tu1.getText()+"','"+tu2.getText()+"','"+tu3.getText()+"','"+tu4.getText()+"','"+tu5.getText()+"','"+tu6.getText()+"','"+tu7.getText()+"','"+tu8.getText()+"'");
                    MySQL.insert("timetbl", "null,"+i+",'Wednesday','"+w0.getText()+"','"+w1.getText()+"','"+w2.getText()+"','"+w3.getText()+"','"+w4.getText()+"','"+w5.getText()+"','"+w6.getText()+"','"+w7.getText()+"','"+w8.getText()+"'");
                    MySQL.insert("timetbl", "null,"+i+",'Thrusday','"+th0.getText()+"','"+th1.getText()+"','"+th2.getText()+"','"+th3.getText()+"','"+th4.getText()+"','"+th5.getText()+"','"+th6.getText()+"','"+th7.getText()+"','"+th8.getText()+"'");
                    MySQL.insert("timetbl", "null,"+i+",'Friday','"+f0.getText()+"','"+f1.getText()+"','"+f2.getText()+"','"+f3.getText()+"','"+f4.getText()+"','"+f5.getText()+"','"+f6.getText()+"','"+f7.getText()+"','"+f8.getText()+"'");

                }
            } catch (SQLException ex) {
                System.out.println("Data Not Entered Error:"+ex);
            }
            this.resetActionPerformed(evt);
            JOptionPane.showMessageDialog(null, "Teacher Details Added!");
        } else {
            MySQL.update("UPDATE teachers SET teach_name = '"+txtTeachName.getText()+"', subject = '"+txtSubj.getText()+"' , classes = '"+txtClasses.getText()+"' WHERE teach_name = '"+(String)cmb.getSelectedItem()+"';");
            try {
                ResultSet rs = MySQL.query("SELECT id FROM teachers WHERE teach_name = '"+ txtTeachName.getText() +"';");
                if(rs.next()){
                    int i = rs.getInt("id");
                    MySQL.update("UPDATE timetbl,teachers SET zero = '"+m0.getText()+"', first = '"+m1.getText()+"', second = '"+m2.getText()+"', third = '"+m3.getText()+"', fourth = '"+m4.getText()+"', fifth = '"+m5.getText()+"', sixth = '"+m6.getText()+"' , seventh = '"+m7.getText()+"', eight = '"+m8.getText()+"' WHERE teach_name = '"+(String)cmb.getSelectedItem()+"' AND day = 'Monday'  AND teach_name = '" + (String)cmb.getSelectedItem() + "' AND teachers.id = timetbl.teach_id ;");
                    MySQL.update("UPDATE timetbl,teachers SET zero = '"+tu0.getText()+"', first = '"+tu1.getText()+"', second = '"+tu2.getText()+"', third = '"+tu3.getText()+"', fourth = '"+tu4.getText()+"', fifth = '"+tu5.getText()+"', sixth = '"+tu6.getText()+"' , seventh = '"+tu7.getText()+"', eight = '"+tu8.getText()+"' WHERE teach_name = '"+(String)cmb.getSelectedItem()+"' AND day = 'Tuesday' AND teach_name = '" + (String)cmb.getSelectedItem() + "' AND teachers.id = timetbl.teach_id ;");
                    MySQL.update("UPDATE timetbl,teachers SET zero = '"+w0.getText()+"', first = '"+w1.getText()+"', second = '"+w2.getText()+"', third = '"+w3.getText()+"', fourth = '"+w4.getText()+"', fifth = '"+w5.getText()+"', sixth = '"+w6.getText()+"' , seventh = '"+w7.getText()+"', eight = '"+w8.getText()+"' WHERE teach_name = '"+(String)cmb.getSelectedItem()+"' AND day = 'Wednesday' AND teach_name = '" + (String)cmb.getSelectedItem() + "' AND teachers.id = timetbl.teach_id ;");
                    MySQL.update("UPDATE timetbl,teachers SET zero = '"+th0.getText()+"', first = '"+th1.getText()+"', second = '"+th2.getText()+"', third = '"+th3.getText()+"', fourth = '"+th4.getText()+"', fifth = '"+th5.getText()+"', sixth = '"+th6.getText()+"' , seventh = '"+th7.getText()+"', eight = '"+th8.getText()+"' WHERE teach_name = '"+(String)cmb.getSelectedItem()+"' AND day = 'Thrusday' AND teach_name = '" + (String)cmb.getSelectedItem() + "' AND teachers.id = timetbl.teach_id ;");
                    MySQL.update("UPDATE timetbl,teachers SET zero = '"+f0.getText()+"', first = '"+f1.getText()+"', second = '"+f2.getText()+"', third = '"+f3.getText()+"', fourth = '"+f4.getText()+"', fifth = '"+f5.getText()+"', sixth = '"+f6.getText()+"' , seventh = '"+f7.getText()+"', eight = '"+f8.getText()+"' WHERE teach_name = '"+(String)cmb.getSelectedItem()+"' AND day = 'Friday' AND teach_name = '" + (String)cmb.getSelectedItem() + "' AND teachers.id = timetbl.teach_id ;");
                }
            } catch (SQLException ex) {
                System.out.println("Data Not Entered Error:"+ex);
            }
            this.resetActionPerformed(evt);
            JOptionPane.showMessageDialog(null, "Teacher Details Updated!");
            this.getData((String)cmb.getSelectedItem());
        }
        MySQL.update("update timetbl set zero = null where zero = '';");
        MySQL.update("update timetbl set first = null where first = '';");
        MySQL.update("update timetbl set second = null where second = '';");
        MySQL.update("update timetbl set third = null where third = '';");
        MySQL.update("update timetbl set fourth = null where fourth = '';");
        MySQL.update("update timetbl set fifth = null where fifth = '';");
        MySQL.update("update timetbl set sixth = null where sixth = '';");
        MySQL.update("update timetbl set seventh = null where seventh = '';");
        MySQL.update("update timetbl set eight = null where eight = '';");

    }//GEN-LAST:event_submitActionPerformed

    private void editChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editChkActionPerformed
        if(editChk.isSelected()){
            cmb.setEnabled(true);
            submit.setText("Edit");
            this.getData((String)cmb.getSelectedItem());
        } else {
            cmb.setEnabled(false);
            submit.setText("Submit");
            this.resetActionPerformed(evt);
        }
    }//GEN-LAST:event_editChkActionPerformed

    private void th0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_th0ActionPerformed

    private void cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbActionPerformed
        this.getData((String)cmb.getSelectedItem());
    }//GEN-LAST:event_cmbActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new InsertData().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmb;
    private javax.swing.JCheckBox editChk;
    private javax.swing.JTextField f0;
    private javax.swing.JTextField f1;
    private javax.swing.JTextField f2;
    private javax.swing.JTextField f3;
    private javax.swing.JTextField f4;
    private javax.swing.JTextField f5;
    private javax.swing.JTextField f6;
    private javax.swing.JTextField f7;
    private javax.swing.JTextField f8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField m0;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JTextField m4;
    private javax.swing.JTextField m5;
    private javax.swing.JTextField m6;
    private javax.swing.JTextField m7;
    private javax.swing.JTextField m8;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JTextField th0;
    private javax.swing.JTextField th1;
    private javax.swing.JTextField th2;
    private javax.swing.JTextField th3;
    private javax.swing.JTextField th4;
    private javax.swing.JTextField th5;
    private javax.swing.JTextField th6;
    private javax.swing.JTextField th7;
    private javax.swing.JTextField th8;
    private javax.swing.JTextField tu0;
    private javax.swing.JTextField tu1;
    private javax.swing.JTextField tu2;
    private javax.swing.JTextField tu3;
    private javax.swing.JTextField tu4;
    private javax.swing.JTextField tu5;
    private javax.swing.JTextField tu6;
    private javax.swing.JTextField tu7;
    private javax.swing.JTextField tu8;
    private javax.swing.JTextArea txtClasses;
    private javax.swing.JTextField txtSubj;
    private javax.swing.JTextField txtTeachName;
    private javax.swing.JTextField w0;
    private javax.swing.JTextField w1;
    private javax.swing.JTextField w2;
    private javax.swing.JTextField w3;
    private javax.swing.JTextField w4;
    private javax.swing.JTextField w5;
    private javax.swing.JTextField w6;
    private javax.swing.JTextField w7;
    private javax.swing.JTextField w8;
    // End of variables declaration//GEN-END:variables
}
