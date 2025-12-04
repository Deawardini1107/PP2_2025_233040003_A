package id.ac.unpas.modul08.view;


import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PersegiPanjangView extends JFrame {
    private final JTextField txtPanjang = new JTextField(10);
    private final JTextField txtLebar = new JTextField(10);
    private final JLabel lblHasil = new JLabel("-");
    private final JLabel lblHasilKeliling = new JLabel("-"); // Latihan 2
    private final JButton btnHitung = new JButton("Hitung Luas");
    private final JButton btnHitungKeliling = new JButton("Hitung Keliling"); // Latihan 2
    private final JButton btnReset = new JButton("Reset"); // Latihan 3

    public PersegiPanjangView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize (350, 300);
        this.setLayout(new GridLayout (6, 2, 10, 10)); // Diubah untuk mengakomodasi Latihan 2 dan Latihan 3
        this.setTitle("MVC Kalkulator Lengkap");

        this.add(new JLabel("Panjang:"));
        this.add(txtPanjang);
        this.add(new JLabel("Lebar:"));
        this.add(txtLebar);
        
        this.add(new JLabel("Hasil Luas:"));
        this.add(lblHasil);
        
        this.add(new JLabel("Hasil Keliling:")); // Latihan 2
        this.add(lblHasilKeliling); // Latihan 2
        
        this.add(btnHitung);
        this.add(btnHitungKeliling); // Latihan 2
        
        this.add(new JLabel(""));
        this.add(btnReset); // Latihan 3
    }

    public double getPanjang() {
        return Double.parseDouble(txtPanjang.getText());
    }

    public double getLebar() {
        return Double.parseDouble(txtLebar.getText());
    }

    public void setHasil (double hasil) {
        lblHasil.setText (String.valueOf(hasil));
    }
    
    public void setHasilKeliling (double hasil) { // Latihan 2
        lblHasilKeliling.setText (String.valueOf(hasil)); // Latihan 2
    }

    public void tampilkanPesanError (String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }
    
    public void resetInput() { // Latihan 3
        txtPanjang.setText(""); // Latihan 3
        txtLebar.setText(""); // Latihan 3
        lblHasil.setText("-"); // Latihan 3
        lblHasilKeliling.setText("-"); // Latihan 3
    }

    public void addHitungListener (ActionListener listener) {
        btnHitung.addActionListener (listener);
    }
    
    public void addHitungKelilingListener (ActionListener listener) { // Latihan 2
        btnHitungKeliling.addActionListener (listener); // Latihan 2
    }
    
    public void addResetListener (ActionListener listener) { // Latihan 3
        btnReset.addActionListener (listener); // Latihan 3
    }
    
}
