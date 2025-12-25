/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.TugasPetemuan10.View;

import id.ac.unpas.TugasPetemuan10.Controller.MahasiswaController;
import id.ac.unpas.TugasPetemuan10.Model.Mahasiswa;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class MahasiswaView extends JFrame {
    private JTextField txtNama, txtNIM, txtJurusan, txtCari;
    private JTable tableMahasiswa;
    private DefaultTableModel model;
    private MahasiswaController controller;

    public MahasiswaView() {
        controller = new MahasiswaController();
        setTitle("Aplikasi CRUD Mahasiswa MVC");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        initComponents();
        loadData();
    }

    private void initComponents() {
        JPanel panelForm = new JPanel(new GridLayout(4, 2, 10, 10));
        panelForm.add(new JLabel("Nama:")); txtNama = new JTextField(); panelForm.add(txtNama);
        panelForm.add(new JLabel("NIM:")); txtNIM = new JTextField(); panelForm.add(txtNIM);
        panelForm.add(new JLabel("Jurusan:")); txtJurusan = new JTextField(); panelForm.add(txtJurusan);

        JPanel panelTombol = new JPanel(new FlowLayout());
        JButton btnSimpan = new JButton("Simpan");
        JButton btnEdit = new JButton("Edit");
        JButton btnHapus = new JButton("Hapus");
        JButton btnClear = new JButton("Clear");
        panelTombol.add(btnSimpan); panelTombol.add(btnEdit); panelTombol.add(btnHapus); panelTombol.add(btnClear);

        txtCari = new JTextField(15);
        JButton btnCari = new JButton("Cari");
        panelTombol.add(new JLabel("Cari:")); panelTombol.add(txtCari); panelTombol.add(btnCari);

        JPanel panelAtas = new JPanel(new BorderLayout());
        panelAtas.add(panelForm, BorderLayout.CENTER);
        panelAtas.add(panelBawahForm(panelTombol), BorderLayout.SOUTH);
        add(panelAtas, BorderLayout.NORTH);

        model = new DefaultTableModel(new String[]{"No", "Nama", "NIM", "Jurusan"}, 0);
        tableMahasiswa = new JTable(model);
        add(new JScrollPane(tableMahasiswa), BorderLayout.CENTER);

        btnSimpan.addActionListener(e -> aksiSimpan());
        btnEdit.addActionListener(e -> aksiEdit());
        btnHapus.addActionListener(e -> aksiHapus());
        btnCari.addActionListener(e -> aksiCari());
        btnClear.addActionListener(e -> kosongkanForm());
    }

    private JPanel panelBawahForm(JPanel tombol) {
        JPanel p = new JPanel(new BorderLayout());
        p.add(tombol, BorderLayout.CENTER);
        return p;
    }

    private void loadData() {
        model.setRowCount(0);
        try {
            List<Mahasiswa> list = controller.getAll();
            int no = 1;
            for (Mahasiswa m : list) {
                model.addRow(new Object[]{no++, m.getNama(), m.getNim(), m.getJurusan()});
            }
        } catch (Exception e) { JOptionPane.showMessageDialog(this, e.getMessage()); }
    }

    private void aksiSimpan() {
        if (txtNama.getText().isEmpty() || txtNIM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!");
            return;
        }
        try {
            if (controller.isNIMExists(txtNIM.getText())) {
                JOptionPane.showMessageDialog(this, "NIM sudah digunakan!");
                return;
            }
            controller.insert(new Mahasiswa(txtNama.getText(), txtNIM.getText(), txtJurusan.getText()));
            loadData();
            kosongkanForm();
        } catch (Exception e) { JOptionPane.showMessageDialog(this, e.getMessage()); }
    }

    private void aksiEdit() {
        try {
            controller.update(new Mahasiswa(txtNama.getText(), txtNIM.getText(), txtJurusan.getText()));
            loadData();
            kosongkanForm();
        } catch (Exception e) { JOptionPane.showMessageDialog(this, e.getMessage()); }
    }

    private void aksiHapus() {
        try {
            controller.delete(txtNIM.getText());
            loadData();
            kosongkanForm();
        } catch (Exception e) { JOptionPane.showMessageDialog(this, e.getMessage()); }
    }

    private void aksiCari() {
        model.setRowCount(0);
        try {
            List<Mahasiswa> list = controller.findByName(txtCari.getText());
            int no = 1;
            for (Mahasiswa m : list) {
                model.addRow(new Object[]{no++, m.getNama(), m.getNim(), m.getJurusan()});
            }
        } catch (Exception e) { JOptionPane.showMessageDialog(this, e.getMessage()); }
    }

    private void kosongkanForm() {
        txtNama.setText(""); txtNIM.setText(""); txtJurusan.setText("");
    }
}