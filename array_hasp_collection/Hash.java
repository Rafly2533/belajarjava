package array_hasp_collection;

import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        // Study kasus: Kode barang dan nama barang
        HashMap<String, String> barang = new HashMap<>();

        // Menambahkan data barang
        barang.put("BRG001", "Laptop");
        barang.put("BRG002", "Mouse");
        barang.put("BRG003", "Keyboard");
        barang.put("BRG004", "Monitor");

        // Menampilkan isi HashMap
        System.out.println("Daftar Barang:");
        for (String kode : barang.keySet()) {
            System.out.println(kode + " → " + barang.get(kode));
        }
    }
}
