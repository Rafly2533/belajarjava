package array_hasp_collection;

public class arraymain {
    public static void main(String[] args) {
        // Study kasus: Hari dalam seminggu
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        System.out.println("Hari ke-5: " + hari[4]);  // Jumat

        // Study kasus: Judul film favorit
        String[] film = new String[3];
        film[0] = "Interstellar";
        film[1] = "Inception";
        film[2] = "Avengers: Endgame";
        System.out.println("Film favorit ke-2: " + film[1]);

        // Study kasus: Nilai ujian
        double[] nilaiUjian = {85.5, 90.0, 72.5, 88.0, 95.5};
        System.out.println("Nilai ujian pertama: " + nilaiUjian[0]);
    }
}
