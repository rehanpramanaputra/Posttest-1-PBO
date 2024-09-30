/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */

public class Guru {
    private String nama;
    private String mataPelajaran;
    private int idGuru;

    // Konstruktor
    public Guru(String nama, String mataPelajaran, int idGuru) {
        this.nama = nama;
        this.mataPelajaran = mataPelajaran;
        this.idGuru = idGuru;
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    public int getIdGuru() {
        return idGuru;
    }

    public void setIdGuru(int idGuru) {
        this.idGuru = idGuru;
    }

    // Metode untuk menampilkan info guru
    public void tampilkanInfoGuru() {
        System.out.println("ID Guru: " + idGuru + ", Nama: " + nama + ", Mata Pelajaran: " + mataPelajaran);
    }
}
