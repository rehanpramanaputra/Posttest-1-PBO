***rogram Manajemen Sekolah***

Program ini adalah sebuah aplikasi CRUD (Create, Read, Update, Delete) sederhana yang bertujuan untuk mengelola data siswa dan guru dalam sebuah sistem manajemen sekolah. Program ini dibuat menggunakan bahasa pemrograman Java dengan konsep OOP (Object-Oriented Programming). Program ini juga menggunakan ArrayList untuk menyimpan daftar siswa dan guru, serta menggunakan perulangan dan percabangan untuk navigasi di dalam program.

***Fitur Program***
Program ini memiliki fitur-fitur sebagai berikut:

--- Menu Manajemen Sekolah ---
1. Tambah Siswa
2. Hapus Siswa (berdasarkan nama)
3. Tampilkan Semua Siswa
4. Tambah Guru
5. Hapus Guru (berdasarkan nama)
6. Tampilkan Semua Guru
7. Tampilkan Total Siswa dan Guru
8. Keluar

***Penjelasan Kelas***
Kelas Siswa (di package model):

*Kelas ini merepresentasikan entitas Siswa dengan properti:*
nama (String): Nama siswa.
kelas (String): Kelas tempat siswa belajar.
idSiswa (int): ID unik untuk siswa.
Kelas ini juga memiliki metode untuk menampilkan informasi siswa.
Kelas Guru (di package model):

***Kelas ini merepresentasikan entitas Guru dengan properti:**

nama (String): Nama guru.
mataPelajaran (String): Mata pelajaran yang diajarkan.
idGuru (int): ID unik untuk guru.
Kelas ini memiliki metode untuk menampilkan informasi guru.
Kelas SekolahService (di package layanan):

**Kelas ini bertanggung jawab untuk memanajemen operasi terkait siswa dan guru.
Kelas ini menggunakan ArrayList untuk menyimpan daftar siswa dan guru, dan memiliki metode untuk:**

Menambah siswa dan guru.
Menampilkan semua siswa dan guru.
Menghapus siswa atau guru berdasarkan indeks.
Menampilkan total jumlah siswa dan guru (menggunakan keyword static).
Kelas Main (di package aplikasi):

**output**

1.Menambah Siswa: Pengguna dapat memasukkan data siswa baru.

![image](https://github.com/user-attachments/assets/487a1e6c-46cf-4610-af90-fd6c07802934)


2.Hapus Siswa (berdasarkan nama)

![image](https://github.com/user-attachments/assets/5e09fa48-8c02-4344-98ce-e0b0e909b887)


3.Melihat Semua Siswa: Pengguna dapat melihat daftar lengkap siswa.

![image](https://github.com/user-attachments/assets/2d1267c6-0c4f-4352-aabd-db0f4051e762)


4.Tambah Guru

![image](https://github.com/user-attachments/assets/3eaee86d-e27d-4d5d-92d8-68551745d06f)




5.Menghapus guru (berdasarkan nama)

![image](https://github.com/user-attachments/assets/7facfc08-77f9-4119-9cf1-43addb4f2d2f)




6.Tampilkan Semua Guru

![image](https://github.com/user-attachments/assets/c4f3ff33-1bea-4553-a59d-75c4bc4466e6)





7.total siswa dan guru

![image](https://github.com/user-attachments/assets/e1ea92db-adb3-4261-ad0d-0beae643af15)



8.Keluar dari Program: Menghentikan eksekusi program.

![image](https://github.com/user-attachments/assets/4185599e-9b2c-4ee5-b80e-1e6e8bbec4d3)


