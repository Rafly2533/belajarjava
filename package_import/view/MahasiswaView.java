package package_import.view;

import package_import.model.Mahasiswa;

public class MahasiswaView {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Ahmad Maulana", 20, "Informatika", 3.85);

        mhs.tampilData();

        System.out.println("\n--- Setelah Update ---");
        mhs.setIpk(3.95);
        mhs.setUmur(21);

        mhs.tampilData();
    }
}
