/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */

public class Siswa {
    private String nama;
    private String kelas;
    private int idSiswa;

    // Konstruktor
    public Siswa(String nama, String kelas, int idSiswa) {
        this.nama = nama;
        this.kelas = kelas;
        this.idSiswa = idSiswa;
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(int idSiswa) {
        this.idSiswa = idSiswa;
    }

    // Metode untuk menampilkan info siswa
    public void tampilkanInfoSiswa() {
        System.out.println("ID Siswa: " + idSiswa + ", Nama: " + nama + ", Kelas: " + kelas);
    }
}
