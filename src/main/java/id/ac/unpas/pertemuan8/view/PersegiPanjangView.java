/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pertemuan8.view;

import javax.swing.*;

public class PersegiPanjangView extends JFrame {

    public JTextField txtPanjang = new JTextField(10);
    public JTextField txtLebar = new JTextField(10);
    public JTextField txtHasil = new JTextField(10);

    public JButton btnHitung = new JButton("Hitung");
    public JButton btnReset = new JButton("Reset");

    public JRadioButton rbLuas = new JRadioButton("Luas", true);
    public JRadioButton rbKeliling = new JRadioButton("Keliling");

    public PersegiPanjangView() {
        setTitle("Persegi Panjang - MVC");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonGroup group = new ButtonGroup();
        group.add(rbLuas);
        group.add(rbKeliling);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Panjang"));
        panel.add(txtPanjang);
        panel.add(new JLabel("Lebar"));
        panel.add(txtLebar);
        panel.add(rbLuas);
        panel.add(rbKeliling);
        panel.add(btnHitung);
        panel.add(btnReset);
        panel.add(new JLabel("Hasil"));
        panel.add(txtHasil);

        add(panel);
    }
}
