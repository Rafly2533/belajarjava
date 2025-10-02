package inheritance.heirarchical;

public class MainTest {
    public static void main(String[] args) {
        // Membuat objek kucing
        Kucing kucing1 = new Kucing();
        kucing1.nama = "Oyen";
        kucing1.usia = 3;
        kucing1.makan();
        kucing1.mengeong();

        System.out.println();

        // Membuat objek burung
        Burung burung1 = new Burung();
        burung1.nama = "Bejo";
        burung1.usia = 2;
        burung1.makan();
        burung1.berkicau();
    }
}
