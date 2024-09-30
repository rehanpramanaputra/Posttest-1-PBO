/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author ACER
 */

import layanan.SekolahService;
import model.Siswa;
import model.Guru;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SekolahService sekolahService = new SekolahService();
        int pilihan;

        do {
            System.out.println("\n--- Menu Manajemen Sekolah ---");
            System.out.println("1. Tambah Siswa");
            System.out.println("2. Hapus Siswa (berdasarkan nama)");
            System.out.println("3. Tampilkan Semua Siswa");
            System.out.println("4. Tambah Guru");
            System.out.println("5. Hapus Guru (berdasarkan nama)");
            System.out.println("6. Tampilkan Semua Guru");
            System.out.println("7. Tampilkan Total Siswa dan Guru");
            System.out.println("8. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama siswa: ");
                    String namaSiswa = scanner.nextLine();
                    System.out.print("Masukkan kelas siswa: ");
                    String kelasSiswa = scanner.nextLine();
                    System.out.print("Masukkan ID siswa: ");
                    int idSiswa = scanner.nextInt();
                    sekolahService.tambahSiswa(new Siswa(namaSiswa, kelasSiswa, idSiswa));
                    break;

                case 2:
                    System.out.print("Masukkan nama siswa yang akan dihapus: ");
                    String namaSiswaHapus = scanner.nextLine();
                    sekolahService.hapusSiswa(namaSiswaHapus);
                    break;

                case 3:
                    sekolahService.tampilkanSemuaSiswa();
                    break;

                case 4:
                    System.out.print("Masukkan nama guru: ");
                    String namaGuru = scanner.nextLine();
                    System.out.print("Masukkan mata pelajaran guru: ");
                    String pelajaranGuru = scanner.nextLine();
                    System.out.print("Masukkan ID guru: ");
                    int idGuru = scanner.nextInt();
                    sekolahService.tambahGuru(new Guru(namaGuru, pelajaranGuru, idGuru));
                    break;

                case 5:
                    System.out.print("Masukkan nama guru yang akan dihapus: ");
                    String namaGuruHapus = scanner.nextLine();
                    sekolahService.hapusGuru(namaGuruHapus);
                    break;

                case 6:
                    sekolahService.tampilkanSemuaGuru();
                    break;

                case 7:
                    SekolahService.tampilkanTotal();
                    break;

                case 8:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Opsi tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 8);

        scanner.close();
    }
}
