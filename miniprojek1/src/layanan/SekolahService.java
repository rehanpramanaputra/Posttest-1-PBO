/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layanan;

/**
 *
 * @author ACER
 */

import model.Siswa;
import model.Guru;
import java.util.ArrayList;

public class SekolahService {
    // Keyword static untuk menghitung jumlah total siswa dan guru
    private static int totalSiswa = 0;
    private static int totalGuru = 0;

    // Daftar siswa dan guru menggunakan ArrayList
    private ArrayList<Siswa> daftarSiswa = new ArrayList<>();
    private ArrayList<Guru> daftarGuru = new ArrayList<>();

    // Metode untuk menambah siswa
    public void tambahSiswa(Siswa siswa) {
        daftarSiswa.add(siswa);
        totalSiswa++;
        System.out.println("Siswa berhasil ditambahkan.");
    }

    // Metode untuk menambah guru
    public void tambahGuru(Guru guru) {
        daftarGuru.add(guru);
        totalGuru++;
        System.out.println("Guru berhasil ditambahkan.");
    }

    // Metode untuk menampilkan semua siswa
    public void tampilkanSemuaSiswa() {
        if (daftarSiswa.isEmpty()) {
            System.out.println("Tidak ada siswa di dalam daftar.");
        } else {
            for (Siswa siswa : daftarSiswa) {
                siswa.tampilkanInfoSiswa();
            }
        }
    }

    // Metode untuk menampilkan semua guru
    public void tampilkanSemuaGuru() {
        if (daftarGuru.isEmpty()) {
            System.out.println("Tidak ada guru di dalam daftar.");
        } else {
            for (Guru guru : daftarGuru) {
                guru.tampilkanInfoGuru();
            }
        }
    }

    // Metode untuk menampilkan jumlah total siswa dan guru
    public static void tampilkanTotal() {
        System.out.println("Total Siswa: " + totalSiswa + ", Total Guru: " + totalGuru);
    }

    // Metode untuk menghapus siswa berdasarkan nama
    public void hapusSiswa(String nama) {
        boolean ditemukan = false;
        for (Siswa siswa : daftarSiswa) {
            if (siswa.getNama().equalsIgnoreCase(nama)) {
                daftarSiswa.remove(siswa);
                totalSiswa--;
                System.out.println("Siswa " + nama + " berhasil dihapus.");
                ditemukan = true;
                break; // Keluar dari loop setelah siswa dihapus
            }
        }
        if (!ditemukan) {
            System.out.println("Siswa dengan nama " + nama + " tidak ditemukan.");
        }
    }

    // Metode untuk menghapus guru berdasarkan nama
    public void hapusGuru(String nama) {
        boolean ditemukan = false;
        for (Guru guru : daftarGuru) {
            if (guru.getNama().equalsIgnoreCase(nama)) {
                daftarGuru.remove(guru);
                totalGuru--;
                System.out.println("Guru " + nama + " berhasil dihapus.");
                ditemukan = true;
                break; // Keluar dari loop setelah guru dihapus
            }
        }
        if (!ditemukan) {
            System.out.println("Guru dengan nama " + nama + " tidak ditemukan.");
        }
    }
}
