/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.PERTEMUAN7;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TugasModul7 extends JFrame {

    private JTextField txtNama;
    private JTextField txtNilai;
    private JComboBox<String> cmbMatkul;
    private JTable tableData;
    private DefaultTableModel tableModel;
    private final JTabbedPane tabbedPane;


    private JPanel createInputPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("Nama Siswa:"));
        txtNama = new JTextField();
        panel.add(txtNama);

        panel.add(new JLabel("Mata Pelajaran:"));
        String[] matkul = {"Matematika Dasar", "Bahasa Indonesia",
            "Algoritma dan Pemrograman I", "Praktikum Pemrograman II"};
        cmbMatkul = new JComboBox<>(matkul);
        panel.add(cmbMatkul);

        panel.add(new JLabel("Nilai (0-100):"));
        txtNilai = new JTextField();
        panel.add(txtNilai);

        JButton btnSimpan = new JButton("Simpan Data");
        panel.add(new JLabel(""));
        panel.add(btnSimpan);

        JButton btnReset = new JButton("Reset Input");
        panel.add(new JLabel(""));
        panel.add(btnReset);

        btnSimpan.addActionListener((ActionEvent e) -> {
            prosesSimpan();
        });
        
        btnReset.addActionListener((ActionEvent e) -> {
            resetForm();
        });

        return panel;
    }

    private JPanel createTablePanel() {
        JPanel panel = new JPanel(new BorderLayout());

        String[] kolom = {"Nama Siswa", "Mata Pelajaran", "Nilai", "Grade"};
        tableModel = new DefaultTableModel(kolom, 0);
        tableData = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(tableData);
        panel.add(scrollPane, BorderLayout.CENTER);

        JPanel panelBawah = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnHapus = new JButton("Hapus Data Terpilih");
        panelBawah.add(btnHapus);
        panel.add(panelBawah, BorderLayout.SOUTH);

        btnHapus.addActionListener((ActionEvent e) -> {
            int selectedRow = tableData.getSelectedRow();
            if (selectedRow > -1) {
                int konfirmasi = JOptionPane.showConfirmDialog(this, 
                        "Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", 
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                
                if (konfirmasi == JOptionPane.YES_OPTION) {
                    tableModel.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, 
                        "Pilih baris yang ingin dihapus terlebih dahulu.", 
                        "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        });

        return panel;
    }

    private void resetForm() {
        txtNama.setText("");
        txtNilai.setText("");
        cmbMatkul.setSelectedIndex(0);
    }
    
    private void prosesSimpan() {
        String nama = txtNama.getText();
        String matkul = (String) cmbMatkul.getSelectedItem();
        String strNilai = txtNilai.getText();

        if (nama.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!",
                    "Error Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (nama.trim().length() < 3) {
             JOptionPane.showMessageDialog(this, "Nama minimal harus 3 karakter!",
                    "Error Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int nilai;
        try {
            nilai = Integer.parseInt(strNilai);
            if (nilai < 0 || nilai > 100) {
                JOptionPane.showMessageDialog(this, "Nilai harus antara 0-100!",
                        "Error Validasi", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nilai harus berupa angka!",
                    "Error Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String grade;
        int nilaiSwitch = nilai / 10;
        
        switch (nilaiSwitch) {
            case 10, 9, 8 -> grade = "A";
            case 7 -> {
                if (nilai >= 70) grade = "AB"; 
                else grade = "B";
            }
            case 6 -> grade = "B";
            case 5 -> grade = "BC";
            case 4 -> grade = "C";
            case 3 -> grade = "D";
            default -> grade = "E";
        }

        Object[] dataBaris = {nama, matkul, nilai, grade};
        tableModel.addRow(dataBaris);

        resetForm();
        JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan!");
        tabbedPane.setSelectedIndex(1);
    }

    public TugasModul7() {
        setTitle("Aplikasi Manajemen Nilai Siswa");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabbedPane = new JTabbedPane();

        JPanel panelInput = createInputPanel();
        tabbedPane.addTab("Input Data", panelInput);

        JPanel panelTabel = createTablePanel();
        tabbedPane.addTab("Daftar Nilai", panelTabel);

        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TugasModul7().setVisible(true);
        });
    }
    
}
