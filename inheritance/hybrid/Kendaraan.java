package inheritance.hybrid;

public class Kendaraan {
    protected String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Ini adalah kendaraan bernama: " + nama);
    }
}
