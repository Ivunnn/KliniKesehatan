public class FrameLoginn extends javax.swing.JFrame {

    public FrameLoginn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        btn_masuk = new javax.swing.JButton();
        btn_daftar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_masuk.setBackground(new java.awt.Color(73, 167, 217));
        btn_masuk.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_masuk.setForeground(new java.awt.Color(255, 255, 255));
        btn_masuk.setText("MASUK");
        btn_masuk.setBorder(null);
        btn_masuk.setBorderPainted(false);
        btn_masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masukActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, 360, 80));

        btn_daftar.setBackground(new java.awt.Color(203, 236, 243));
        btn_daftar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_daftar.setForeground(new java.awt.Color(73, 167, 217));
        btn_daftar.setText("DAFTAR");
        btn_daftar.setBorder(null);
        btn_daftar.setBorderPainted(false);
        btn_daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_daftarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 730, 360, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tampilan_klinik/Login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 1024));

        pack();
    }

    private void btn_masukActionPerformed(java.awt.event.ActionEvent evt) {                                          
        new FrameMasuk().setVisible(true); // Buka halaman FrameMasuk
        this.setVisible(false); // Sembunyikan halaman FrameLoginn
    }                                         

    private void btn_daftarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        new identitas_dirii().setVisible(true); // Buka halaman identitas_dirii
        this.setVisible(false); // Sembunyikan halaman FrameLoginn
    }                                          

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameLoginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLoginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLoginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLoginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLoginn().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btn_daftar;
    private javax.swing.JButton btn_masuk;
    private javax.swing.JLabel jLabel1;
}
