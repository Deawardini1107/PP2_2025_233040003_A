/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.PERTEMUAN5;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Latihan3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Latihan 3 - JButton & Action");
        JLabel label = new JLabel("Teks Awal");
        JButton button = new JButton("Klik Saya!");

        frame.setLayout(new FlowLayout());

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Tombol sudah diklik");
            }
        });

        frame.add(label);
        frame.add(button);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

