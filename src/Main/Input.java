package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Input extends javax.swing.JFrame {

    DefaultListModel dlm1 = new DefaultListModel();
    DefaultListModel dlm2 = new DefaultListModel();
    
    MySQLConnect MySQL = new MySQLConnect(ConnectionDetails.pass, ConnectionDetails.user, ConnectionDetails.databaseName);
        
    public Input() {
        initComponents();
        ResultSet rs = MySQL.query("SELECT teach_name FROM teachers;");
        try {
            while(rs.next()){
                String name = rs.getString("teach_name");                
                this.dlm1.addElement(name);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        this.teachersList.setModel(this.dlm1);
        this.absTeachersList.setModel(this.dlm2);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dayCb = new javax.swing.JComboBox();
        teachLbl = new javax.swing.JLabel();
        absTeachLbl = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        teachersList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        absTeachersList = new javax.swing.JList();
        toAbsBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        toPreBtn = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 300));

        dayCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday" }));

        teachLbl.setText("Teachers");

        absTeachLbl.setText("Absent Teachers");

        submit.setText("Create Chart");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        teachersList.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(teachersList);

        absTeachersList.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(absTeachersList);

        toAbsBtn.setText(">");
        toAbsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toAbsBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("<<");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        toPreBtn.setText("<");
        toPreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toPreBtnActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Database Settings");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Insert/Edit Records");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menu.add(jMenu1);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teachLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(toPreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(toAbsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(absTeachLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(dayCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(toAbsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toPreBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teachLbl)
                            .addComponent(absTeachLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(!dlm2.isEmpty()){
            String ids = "";
            int size = dlm2.getSize();
            for(int i = 0; i<size; i++){
                int id = this.getTeachID((String)dlm2.getElementAt(i));
                ids += id + ",";
            }
            ids = ids.substring(0, ids.length()-1);
            System.out.println("ids="+ids);
            new Execution(ids, this.dayCb.getSelectedItem().toString());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please Choose The Absent Teachers");
        }
}//GEN-LAST:event_submitActionPerformed

    private void toAbsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toAbsBtnActionPerformed
        int i = this.teachersList.getSelectedIndex();        
        dlm2.addElement(dlm1.getElementAt(i));        
        dlm1.removeElementAt(i);
        this.teachersList.setModel(this.dlm1);
        this.absTeachersList.setModel(this.dlm2);
        
    }//GEN-LAST:event_toAbsBtnActionPerformed

    private void toPreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toPreBtnActionPerformed
        int i = this.absTeachersList.getSelectedIndex();        
        dlm1.addElement(dlm2.getElementAt(i));
        dlm2.removeElementAt(i);
        this.teachersList.setModel(this.dlm1);
        this.absTeachersList.setModel(this.dlm2);
    }//GEN-LAST:event_toPreBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        int size = dlm2.getSize();
        for(int i = 0; i<size; i++){
            dlm1.addElement(dlm2.getElementAt(i));
        }
        dlm2.removeAllElements();
        this.teachersList.setModel(this.dlm1);
        this.absTeachersList.setModel(this.dlm2);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new InsertData().setVisible(true);                
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new ConnectSettings().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public int getTeachID(String name){
        int id = -1;
        ResultSet rs = MySQL.query("SELECT id FROM teachers WHERE teach_name = '" + name + "';");
        try {            
            if(rs.next()){
                id = rs.getInt("id");
            }            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return id;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Input().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel absTeachLbl;
    private javax.swing.JList absTeachersList;
    private javax.swing.JComboBox dayCb;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuBar menu;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton submit;
    private javax.swing.JLabel teachLbl;
    private javax.swing.JList teachersList;
    private javax.swing.JButton toAbsBtn;
    private javax.swing.JButton toPreBtn;
    // End of variables declaration//GEN-END:variables
}
