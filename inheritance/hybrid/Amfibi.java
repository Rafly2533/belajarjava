package inheritance.hybrid;

public class Amfibi extends Kendaraan implements KendaraanDarat, KendaraanAir {

    public Amfibi(String nama) {
        super(nama);
    }

    @Override
    public void berjalan() {
        System.out.println(nama + " berjalan di jalan raya.");
    }

    @Override
    public void berenang() {
        System.out.println(nama + " juga bisa berenang di air!");
    }

    public void modeKhusus() {
        System.out.println(nama + " mengaktifkan mode amfibi!");
    }
}
