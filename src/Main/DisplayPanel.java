package Main;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DisplayPanel extends javax.swing.JPanel {

    public DisplayPanel(ArrayList<AbsentTeacher> absL) {
        initComponents();
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
        for(AbsentTeacher abT : absL){
            System.out.println(abT.name + " " + abT.chart[0] + " " + abT.chart[1] + " " + abT.chart[2] + " " + abT.chart[3] + " " + abT.chart[4] + " " + abT.chart[5] + " " + abT.chart[6] + " " + abT.chart[7] + " " + abT.chart[8]);
            dtm.addRow(new Object[]{abT.name,abT.chart[0],abT.chart[1],abT.chart[2],abT.chart[3],abT.chart[4],abT.chart[5],abT.chart[6],abT.chart[7],abT.chart[8]});
        }
        
        tbl.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher Absent", "0", "1", "2", "3", "4", "5", "6", "7", "8"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
