/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN6;

import javax.swing.*;
import java.awt.*;

public class ContohFlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Default layout dari JPanel adalah FlowLayout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("Tombol 1"));
        panel.add(new JButton("Tombol 2"));
        panel.add(new JButton("Tombol 3"));
        panel.add(new JButton("Tombol 4"));
        panel.add(new JButton("Tombol 5"));

        frame.add(panel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
