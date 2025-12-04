/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul08;



public class PersegiPanjangModel {
    private double panjang;
    private double lebar;
    private double luas;
    private double keliling; // Latihan 2

    public void hitungLuas() {
        this.luas = this.panjang * this.lebar;
    }

    public void hitungKeliling() { // Latihan 2
        this.keliling = 2 * (this.panjang + this.lebar); // Latihan 2
    }

    public void setPanjang (double panjang) {
        this.panjang = panjang;
    }

    public void setLebar (double lebar) {
        this.lebar = lebar;
    }

    public double getLuas() {
        return luas;
    }
    
    public double getKeliling() { // Latihan 2
        return keliling; // Latihan 2
    }
}
