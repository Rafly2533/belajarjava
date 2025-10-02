package inheritance.hybrid;

public class Main {
    public static void main(String[] args) {
        Amfibi kendaraan = new Amfibi("Mobil Amfibi");

        kendaraan.info();        // dari class Kendaraan
        kendaraan.berjalan();    // dari interface KendaraanDarat
        kendaraan.berenang();    // dari interface KendaraanAir
        kendaraan.modeKhusus();  // method khusus Amfibi
    }
}
