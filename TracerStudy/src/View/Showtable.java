/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Lulusan;
import Model.Pekerjaan;
import Model.p2m;
import Model.prestasi;
import Model.ta;
import controller.ExecuteLulusan;
import controller.ExecuteP2m;
import controller.ExecutePekerjaan;
import controller.ExecutePrestasi;
import controller.ExecuteTa;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Showtable extends javax.swing.JFrame {

    /**
     * Creates new form Showtable
     *
     */
    public void tampilta(){
        ExecuteTa  exT = new ExecuteTa();
        List<ta> allT = exT.getAll();
        Object[][] dtT = new Object[allT.size()][5];
        int row = 0;
        for (ta t : allT){
            dtT[row][0] = t.getId_ta();
            dtT[row][1] = t.getId_lulusan();
            dtT[row][2] = t.getJudul();
            dtT[row][3] = t.getPembimbing();
            row++;
        }
        
        jTable6 = new javax.swing.JTable();

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            dtT,
            new String [] {
                "Id_TA", "Id_Lulusan", "Judul", "Pembimbing"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });



        jScrollPane6.setViewportView(jTable6);



    }
    public void tampilprestasi(){
        ExecutePrestasi  exPts = new ExecutePrestasi();
        List<prestasi> allPts = exPts.getAll();
        Object[][] dtPts = new Object[allPts.size()][5];
        int row = 0;
        for (prestasi pts : allPts){
            dtPts[row][0] = pts.getId_prestasi();
            dtPts[row][1] = pts.getId_lulusan();
            dtPts[row][2] = pts.getNama_kegiatan();
            dtPts[row][3] = pts.getPeringkat();
            row++;
        }
        
        jTable5 = new javax.swing.JTable();

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            dtPts,
            new String [] {
                "Id_Prestasi", "Id_Lulusan", "Jenis_prestasi", "Nama_Kegiatan", "Peringkat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });



        jScrollPane5.setViewportView(jTable5);



    }
    public void tampilp2m(){
        ExecuteP2m  exPm = new ExecuteP2m();
        List<p2m> allPm = exPm.getAll();
        Object[][] dtPm = new Object[allPm.size()][4];
        int row = 0;
        for (p2m pm : allPm){
            dtPm[row][0] = pm.getId_p2m();
            dtPm[row][1] = pm.getId_lulusan();
            dtPm[row][2] = pm.getJenis_p2m();
            dtPm[row][3] = pm.getTempat();
            row++;
        }
        
        jTable4 = new javax.swing.JTable();

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            dtPm,
            new String [] {
                "Id_P2m", "Id_Lulusan", "Jenis_P2m", "Tempat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });



        jScrollPane4.setViewportView(jTable4);



    }
    public void tampilpekerjaan(){
        ExecutePekerjaan  exPkj = new ExecutePekerjaan();
        List<Pekerjaan> allPkj = exPkj.getAll();
        Object[][] dtPkj = new Object[allPkj.size()][4];
        int row = 0;
        for (Pekerjaan pkj : allPkj){
            dtPkj[row][0] = pkj.getId_pekerjaan();
            dtPkj[row][1] = pkj.getId_lulusan();
            dtPkj[row][2] = pkj.getJenis_pekerjaan();
            dtPkj[row][3] = pkj.getAlamat_pekerjaan();
            row++;
        }
        
        jTable3 = new javax.swing.JTable();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
           dtPkj,
            new String [] {
                "Id_Pekerjaan", "Id_Lulusan", "Jenis_Pekerjaan", "Alamat_Pekerjaan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });



        jScrollPane3.setViewportView(jTable3);



    }
    public void tampillulusan(){
        ExecuteLulusan  exLsn = new ExecuteLulusan();
        List<Lulusan> allLsn = exLsn.getAll();
        Object[][] dtLsn = new Object[allLsn.size()][9];
        int row = 0;
        for (Lulusan lsn : allLsn){
            dtLsn[row][0] = lsn.getId_lulusan();
            dtLsn[row][1] = lsn.getNama_lulusan();
            dtLsn[row][2] = lsn.getTanggal_lahir();
            dtLsn[row][3] = lsn.getJenjang();
            dtLsn[row][4] = lsn.getProgram_studi();
            dtLsn[row][5] = lsn.getEmail();
            dtLsn[row][6] = lsn.getAlamat();
            dtLsn[row][7] = lsn.getNo_tlp();
            dtLsn[row][8] = lsn.getIpk();
            row++;
        }
        
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            dtLsn,
            new String [] {
                "Id_Lulusan", "Nama_Lulusan", "Tanggal_Lahir", "Jenjang", "program_studi", "Email", "Alamat", "No_tlp", "Ipk"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });



        jScrollPane1.setViewportView(jTable1);



    }
    public Showtable() {
        initComponents();
        tampillulusan();
        tampilpekerjaan();
        tampilp2m();
        tampilprestasi();
        tampilta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_Lulusan", "Nama_Lulusan", "Tanggal_Lahir", "Jenjang", "program_studi", "Email", "Alamat", "No_tlp", "Ipk"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 893, 102));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_Pekerjaan", "Id_Lulusan", "Jenis_Pekerjaan", "Alamat_Pekerjaan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, 100));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_P2m", "Id_Lulusan", "Jenis_P2m", "Tempat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, 100));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id_Prestasi", "Id_Lulusan", "Jenis_prestasi", "Nama_Kegiatan", "Peringkat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 514, 98));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_TA", "Id_Lulusan", "Judul", "Pembimbing"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, 98));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Data Prestasi Lulusan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Data Lulusan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Data Pekerjaan Lulusan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Data P2M Lulusan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Data TA Lulusan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 1150, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Showtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Showtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Showtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Showtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Showtable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    // End of variables declaration//GEN-END:variables
}
