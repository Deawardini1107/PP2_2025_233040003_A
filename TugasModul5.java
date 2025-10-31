/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUN5;

import javax.swing.*;
import java.awt.*;


public class TugasModul5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tugas Modul 5 - Komponen GUI");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Tekan tombol di sekitar", JLabel.CENTER);

        JButton btnNorth = new JButton("NORTH");
        JButton btnSouth = new JButton("SOUTH");
        JButton btnEast  = new JButton("EAST");
        JButton btnWest  = new JButton("WEST");

        frame.add(label, BorderLayout.CENTER);
        frame.add(btnNorth, BorderLayout.NORTH);
        frame.add(btnSouth, BorderLayout.SOUTH);
        frame.add(btnEast,  BorderLayout.EAST);
        frame.add(btnWest,  BorderLayout.WEST);

        btnNorth.addActionListener(e -> label.setText("Tombol di atas (NORTH) ditekan"));
        btnSouth.addActionListener(e -> label.setText("Tombol di bawah (SOUTH) ditekan"));
        btnEast.addActionListener(e -> label.setText("Tombol di kanan (EAST) ditekan"));
        btnWest.addActionListener(e -> label.setText("Tombol di kiri (WEST) ditekan"));

        frame.setVisible(true);
    }
}
