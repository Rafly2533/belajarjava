package package_import.model;

public class Mahasiswa {
    private String nama;
    private int umur;
    private String prodi;
    private double ipk;

    public Mahasiswa(String nama, int umur, String prodi, double ipk) {
        this.nama = nama;
        this.umur = umur;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getUmur() { return umur; }
    public void setUmur(int umur) { this.umur = umur; }

    public String getProdi() { return prodi; }
    public void setProdi(String prodi) { this.prodi = prodi; }

    public double getIpk() { return ipk; }
    public void setIpk(double ipk) { this.ipk = ipk; }

    public void tampilData() {
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur);
        System.out.println("Prodi : " + prodi);
        System.out.println("IPK   : " + ipk);
    }
}
