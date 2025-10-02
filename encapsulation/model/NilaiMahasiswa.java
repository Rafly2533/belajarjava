package encapsulation.model;

public class NilaiMahasiswa {
    // Attribute dengan Access Modifier private
    private String mataKuliah;
    private double nilai;

    // Constant (Non-Access Modifier)
    public static final int GRADE_MAX = 100;

    // Constructor
    public NilaiMahasiswa(String mataKuliah, double nilai) {
        this.mataKuliah = mataKuliah;
        setNilai(nilai); // gunakan setter agar validasi tetap berjalan
    }

    // Getter
    public String getMataKuliah() {
        return mataKuliah;
    }

    public double getNilai() {
        return nilai;
    }

    // Setter
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= GRADE_MAX) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai tidak valid! Harus 0 - " + GRADE_MAX);
        }
    }

    // Method tampil data
    public void tampilInfo() {
        System.out.println("Mata Kuliah : " + mataKuliah);
        System.out.println("Nilai       : " + nilai);
        System.out.println("Nilai Maks  : " + GRADE_MAX);
    }
}
