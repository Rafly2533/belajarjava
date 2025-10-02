package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionRaf {
    public static void main(String[] args) {
        // Contoh Unchecked Exception (ArrayIndexOutOfBounds)
        try {
            String[] buah = {"Apel", "Jeruk", "Mangga"};
            System.out.println("Buah ke-5: " + buah[4]); // salah index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kesalahan array: " + e.getMessage());
        } finally {
            System.out.println("Blok finally tetap dijalankan (array).");
        }

        // Contoh Checked Exception (baca file daftar siswa)
        try {
            bacaFile("siswa.txt");
        } catch (IOException e) {
            System.out.println("Gagal membaca file: " + e.getMessage());
        }
    }

    // Method dengan deklarasi throws IOException
    public static void bacaFile(String namaFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(namaFile));
        String line;
        System.out.println("\nIsi file " + namaFile + ":");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
