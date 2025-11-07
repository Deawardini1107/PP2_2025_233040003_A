/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN6;
import javax.swing.*;
import java.awt.*;

public class KalkulatorSederhana {
     public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout(10, 10));

        // Bagian layar
        JTextField layar = new JTextField();
        layar.setEditable(false);
        layar.setHorizontalAlignment(JTextField.RIGHT);
        layar.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(layar, BorderLayout.NORTH);

        // Bagian tombol
        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new GridLayout(4, 4, 5, 5));

        String[] tombol = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String teks : tombol) {
            JButton btn = new JButton(teks);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            panelTombol.add(btn);
        }

        frame.add(panelTombol, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}