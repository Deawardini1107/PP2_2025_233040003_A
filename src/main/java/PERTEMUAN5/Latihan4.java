/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class Latihan4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Contoh BorderLayout");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            
            JLabel label = new JLabel("Label ada di Atas (NORTH)");
            JButton southButton = new JButton("Tombol ada di Bawah (SOUTH)");
            JButton westButton = new JButton("WEST");
            JButton eastButton = new JButton("EAST");
            JButton centerButton = new JButton("CENTER");
            
            southButton.addActionListener((var e) -> {
                label.setText("Tombol di SOUTH diklik!");
                frame.getContentPane().setBackground(Color.PINK);
            });
            
            westButton.addActionListener(e -> {
                label.setText("Tombol di WEST diklik!");
                frame.getContentPane().setBackground(Color.PINK);
            });
            
            eastButton.addActionListener((var e) -> {
                label.setText("Tombol di EAST diklik!");
                frame.getContentPane().setBackground(Color.pink);
            });
            
            centerButton.addActionListener((ActionEvent e) -> {
                label.setText("Tombol di CENTER diklik!");
                frame.getContentPane().setBackground(Color.PINK);
            });
            
            frame.add(label, BorderLayout.NORTH);
            frame.add(southButton, BorderLayout.SOUTH);
            frame.add(westButton, BorderLayout.WEST);
            frame.add(eastButton, BorderLayout.EAST);
            frame.add(centerButton, BorderLayout.CENTER);
            
            frame.setVisible(true);
        });
    }
}
