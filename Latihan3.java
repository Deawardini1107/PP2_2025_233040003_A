/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUN5;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class Latihan3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label dan Tombol");
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Klik tombol di samping →");
        JButton button = new JButton("Klik Saya!");

        // aksi tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Tombol berhasil diklik!");
            }
        });

        frame.add(label);
        frame.add(button);

        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
 