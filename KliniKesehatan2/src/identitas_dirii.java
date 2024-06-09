import koneksi.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Penulis: yudas
 */
public class identitas_dirii extends javax.swing.JFrame {

    /**
     * Membuat form baru identitas_diri
     */
    public identitas_dirii() {
        initComponents();
    }

    /**
     * Method ini dipanggil dari dalam konstruktor untuk menginisialisasi form.
     * WARNING: Jangan modifikasi kode ini. Isi method ini selalu 
     * dihasilkan ulang oleh Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        input_email = new javax.swing.JTextField();
        input_noTelepon = new javax.swing.JTextField();
        input_nama = new javax.swing.JTextField();
        input_ttl = new javax.swing.JTextField(); // Mengubah jTextField1 menjadi input_ttl
        input_nik = new javax.swing.JTextField();
        tombol = new javax.swing.JButton();
        background = new javax.swing.JLabel(); // Mengubah input_ttl menjadi background

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        input_email.setBorder(null);
        getContentPane().add(input_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 204, 500, 40));

        input_noTelepon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        input_noTelepon.setBorder(null);
        getContentPane().add(input_noTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 324, 500, 40));

        input_nama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        input_nama.setBorder(null);
        getContentPane().add(input_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 444, 500, 40));

        input_ttl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        input_ttl.setBorder(null);
        getContentPane().add(input_ttl, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 566, 500, 40));

        input_nik.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        input_nik.setBorder(null);
        getContentPane().add(input_nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 688, 500, 40));

        tombol.setBackground(new java.awt.Color(73, 191, 217));
        tombol.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        tombol.setForeground(new java.awt.Color(255, 255, 255));
        tombol.setText("DAFTAR");
        tombol.setAutoscrolls(true);
        tombol.setBorder(null);
        tombol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolActionPerformed(evt);
            }
        });
        getContentPane().add(tombol, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 760, 350, 80));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tampilan_klinik/Identitas_diri.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0 , 1440, 910));

        pack();
    }// </editor-fold>                        

    private void tombolActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String nik = input_nik.getText();
        String email = input_email.getText();
        String noTelepon = input_noTelepon.getText();
        String nama = input_nama.getText();
        String ttl = input_ttl.getText();

        // Validasi input
        if (nik.isEmpty() || email.isEmpty() || noTelepon.isEmpty() || nama.isEmpty() || ttl.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = koneksi.getConnection();
            String sql = "INSERT INTO data_diri (NIK, email, no_telepon, nama_lengkap, tanggal_lahir) VALUES (?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, nik);
            pst.setString(2, email);
            pst.setString(3, noTelepon);
            pst.setString(4, nama);
            pst.setString(5, ttl);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");

            // Redirect ke halaman keluhan_diri setelah berhasil menambahkan data
            keluhan_diri keluhan = new keluhan_diri();
            this.setVisible(false);
            keluhan.setVisible(true);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error saat menutup koneksi: " + ex.getMessage());
            }
        }
    }                                      

    /**
     * @param args argumen baris perintah
     */
    public static void main(String args[]) {
        /* Atur tampilan dan nuansa Nimbus */
        //<editor-fold defaultstate="collapsed" desc=" Pengaturan tampilan dan nuansa (opsional) ">
        /* Jika Nimbus (diperkenalkan di Java SE 6) tidak tersedia, tetap gunakan tampilan default.
         * Untuk detail, lihat http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(identitas_diri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(identitas_diri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(identitas_diri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(identitas_diri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Membuat dan menampilkan form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new identitas_dirii().setVisible(true);
            }
        });
    }

    // Deklarasi variabel                     
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_nama;
    private javax.swing.JTextField input_nik;
    private javax.swing.JTextField input_noTelepon;
    private javax.swing.JTextField input_ttl; // Mengubah jTextField1 menjadi input_ttl
    private javax.swing.JButton tombol;
    private javax.swing.JLabel background; // Mengubah input_ttl menjadi background
    // Akhir deklarasi variabel                   
}
