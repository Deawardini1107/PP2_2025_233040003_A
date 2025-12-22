/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.PERTEMUAN5;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Latihan4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Latihan 4 - BorderLayout");

        JLabel label = new JLabel("Klik salah satu tombol", SwingConstants.CENTER);

        JButton btnNorth = new JButton("NORTH");
        JButton btnSouth = new JButton("SOUTH");
        JButton btnEast  = new JButton("EAST");
        JButton btnWest  = new JButton("WEST");
        JButton btnCenter = new JButton("CENTER");

        frame.setLayout(new BorderLayout());

        frame.add(label, BorderLayout.NORTH);
        frame.add(btnSouth, BorderLayout.SOUTH);
        frame.add(btnEast, BorderLayout.EAST);
        frame.add(btnWest, BorderLayout.WEST);
        frame.add(btnCenter, BorderLayout.CENTER);

        btnNorth.addActionListener(e -> label.setText("Tombol NORTH diklik"));
        btnSouth.addActionListener(e -> label.setText("Tombol SOUTH diklik"));
        btnEast.addActionListener(e -> label.setText("Tombol EAST diklik"));
        btnWest.addActionListener(e -> label.setText("Tombol WEST diklik"));
        btnCenter.addActionListener(e -> label.setText("Tombol CENTER diklik"));

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

    
    

