/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.PERTEMUAN5;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Latihan2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Latihan 2 - JLabel");
        JLabel label = new JLabel("Hello World dari JLabel");

        frame.add(label);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

    