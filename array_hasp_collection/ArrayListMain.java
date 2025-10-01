package array_hasp_collection;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        // Study kasus: daftar menu makanan kantin
        ArrayList<String> menuKantin = new ArrayList<>();

        // Tambah menu makanan
        menuKantin.add("Nasi Goreng");
        menuKantin.add("Mie Ayam");
        menuKantin.add("Soto Ayam");
        menuKantin.add("Bakso");
        menuKantin.add("Ayam Geprek");

        // Tampilkan semua menu
        System.out.println("Daftar Menu Kantin:");
        for (String menu : menuKantin) {
            System.out.println("- " + menu);
        }

        // Menghapus salah satu menu
        menuKantin.remove("Bakso");

        System.out.println("\nSetelah Bakso dihapus:");
        for (String menu : menuKantin) {
            System.out.println("- " + menu);
        }
    }
}
