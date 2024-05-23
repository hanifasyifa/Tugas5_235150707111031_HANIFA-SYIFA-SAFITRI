import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JTextField namaField, tglLahirField, noDaftarField, noTelpField, alamatField, emailField;
    private JButton submitButton;

    public MainForm() {
        setTitle("Daftar Ulang Mahasiswa Baru");
        setSize(600, 450); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(12, 1, 10, 10)); 

        Font inputFont = new Font("Arial", Font.PLAIN, 15); 
        Font labelFont = new Font("Arial", Font.BOLD, 15); 

        JLabel namaLabel = new JLabel("Nama Lengkap:");
        namaLabel.setFont(labelFont); 
        namaField = new JTextField();
        namaField.setFont(inputFont); 
        namaField.setPreferredSize(new Dimension(400, 45)); 
        add(namaLabel);
        add(namaField);

        JLabel tglLahirLabel = new JLabel("Tanggal Lahir:");
        tglLahirLabel.setFont(labelFont); 
        tglLahirField = new JTextField();
        tglLahirField.setFont(inputFont); 
        tglLahirField.setPreferredSize(new Dimension(400, 45)); 
        add(tglLahirLabel);
        add(tglLahirField);

        JLabel noDaftarLabel = new JLabel("Nomor Pendaftaran:");
        noDaftarLabel.setFont(labelFont); 
        noDaftarField = new JTextField();
        noDaftarField.setFont(inputFont); 
        noDaftarField.setPreferredSize(new Dimension(400, 45)); 
        add(noDaftarLabel);
        add(noDaftarField);

        JLabel noTelpLabel = new JLabel("No. Telp:");
        noTelpLabel.setFont(labelFont); 
        noTelpField = new JTextField();
        noTelpField.setFont(inputFont); 
        noTelpField.setPreferredSize(new Dimension(400, 45)); 
        add(noTelpLabel);
        add(noTelpField);

        JLabel alamatLabel = new JLabel("Alamat:");
        alamatLabel.setFont(labelFont); 
        alamatField = new JTextField();
        alamatField.setFont(inputFont); 
        alamatField.setPreferredSize(new Dimension(400, 45)); 
        add(alamatLabel);
        add(alamatField);

        JLabel emailLabel = new JLabel("E-mail:");
        emailLabel.setFont(labelFont); 
        emailField = new JTextField();
        emailField.setFont(inputFont); 
        emailField.setPreferredSize(new Dimension(400, 45)); 
        add(emailLabel);
        add(emailField);

        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.BOLD, 15)); 
        submitButton.setPreferredSize(new Dimension(400, 45)); 
        submitButton.addActionListener(new SubmitAction());
        add(new JLabel()); 
        add(new JLabel());
        add(new JLabel());
        add(new JLabel());
        add(new JLabel());
        
        add(submitButton);

        setLocationRelativeTo(null);
    }

    private class SubmitAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (namaField.getText().isEmpty() || tglLahirField.getText().isEmpty() ||
                    noDaftarField.getText().isEmpty() || noTelpField.getText().isEmpty() ||
                    alamatField.getText().isEmpty() || emailField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(MainForm.this, "Semua kolom harus diisi!",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int result = JOptionPane.showConfirmDialog(MainForm.this,
                        "Apakah anda yakin data yang Anda isi sudah benar?",
                        "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    DataDisplay dataDisplay = new DataDisplay(namaField.getText(),
                            tglLahirField.getText(),
                            noDaftarField.getText(),
                            noTelpField.getText(),
                            alamatField.getText(),
                            emailField.getText());
                    dataDisplay.setVisible(true);
                    MainForm.this.dispose();
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainForm mainForm = new MainForm();
            mainForm.setVisible(true);
        });
    }
}