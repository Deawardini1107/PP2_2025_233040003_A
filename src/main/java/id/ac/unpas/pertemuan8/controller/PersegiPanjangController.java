/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pertemuan8.controller;

import id.ac.unpas.pertemuan8.model.PersegiPanjangModel;
import id.ac.unpas.pertemuan8.view.PersegiPanjangView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersegiPanjangController {

    private final PersegiPanjangModel model;
    private final PersegiPanjangView view;


    public PersegiPanjangController(PersegiPanjangModel model, PersegiPanjangView view) {
        this.model = model;
        this.view = view;

        view.btnHitung.addActionListener(new HitungListener());
        view.btnReset.addActionListener(new ResetListener());
    }

    class HitungListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double panjang = Double.parseDouble(view.txtPanjang.getText());
            double lebar = Double.parseDouble(view.txtLebar.getText());

            model.setPanjang(panjang);
            model.setLebar(lebar);

            double hasil;
            if (view.rbLuas.isSelected()) {
                hasil = model.hitungLuas();
            } else {
                hasil = model.hitungKeliling();
            }

            view.txtHasil.setText(String.valueOf(hasil));
        }
    }
    
        class ResetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.txtPanjang.setText("");
            view.txtLebar.setText("");
            view.txtHasil.setText("");
            view.rbLuas.setSelected(true);
        }
    }

}
