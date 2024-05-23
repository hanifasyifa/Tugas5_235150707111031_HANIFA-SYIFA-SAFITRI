import javax.swing.*;
import java.awt.*;

public class DataDisplay extends JFrame {
    public DataDisplay(String nama, String tglLahir, String noDaftar, String noTelp, String alamat, String email) {
        setTitle("Data Mahasiswa");
        setSize(600, 500); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1, 10, 10)); 

        Font dataFont = new Font("Arial", Font.PLAIN, 20); 

        JLabel namaLabel = new JLabel("Nama Lengkap: " + nama);
        namaLabel.setFont(dataFont); 
        JLabel tglLahirLabel = new JLabel("Tanggal Lahir: " + tglLahir);
        tglLahirLabel.setFont(dataFont); 
        JLabel noDaftarLabel = new JLabel("Nomor Pendaftaran: " + noDaftar);
        noDaftarLabel.setFont(dataFont); 
        JLabel noTelpLabel = new JLabel("No. Telp: " + noTelp);
        noTelpLabel.setFont(dataFont); 
        JLabel alamatLabel = new JLabel("Alamat: " + alamat);
        alamatLabel.setFont(dataFont); 
        JLabel emailLabel = new JLabel("E-mail: " + email);
        emailLabel.setFont(dataFont); 

        add(namaLabel);
        add(tglLahirLabel);
        add(noDaftarLabel);
        add(noTelpLabel);
        add(alamatLabel);
        add(emailLabel);

        setLocationRelativeTo(null);
    }
}