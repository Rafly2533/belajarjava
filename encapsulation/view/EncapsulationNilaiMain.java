package encapsulation.view;

import encapsulation.model.NilaiMahasiswa;

public class EncapsulationNilaiMain {
    public static void main(String[] args) {
        // Membuat objek nilai mahasiswa
        NilaiMahasiswa nilai1 = new NilaiMahasiswa("Algoritma", 85);

        // Tampilkan data awal
        nilai1.tampilInfo();

        // Ubah data pakai setter
        nilai1.setNilai(95);
        nilai1.setMataKuliah("Struktur Data");

        System.out.println("\nSetelah diubah:");
        nilai1.tampilInfo();

        // Contoh nilai tidak valid
        nilai1.setNilai(150); // akan ditolak karena > 100
    }
}
