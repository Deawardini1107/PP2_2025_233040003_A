/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.PERTEMUAN6;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.GridLayout;

public class KonverterSuhu extends JFrame {

    public KonverterSuhu() {
        setTitle("Konverter Suhu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 5, 5));

        JLabel lblC = new JLabel("Celcius:");
        JTextField txtC = new JTextField();
        JButton btn = new JButton("Konversi");
        JLabel lblF = new JLabel("Fahrenheit:");
        JLabel hasil = new JLabel("");

        btn.addActionListener(e -> {
            try {
                double c = Double.parseDouble(txtC.getText());
                double f = (c * 9 / 5) + 32;
                hasil.setText(String.valueOf(f));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    this,
                    "Input harus berupa angka!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        });

        add(lblC); add(txtC);
        add(btn);  add(new JLabel(""));
        add(lblF); add(hasil);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KonverterSuhu());
    }
}
