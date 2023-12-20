package javafol;

public class Procedure {

    // kalo ini tanpa parameter
    static void informasihari() {
        System.out.println("Hari ini merupakan hari selasa");
    }

    // kalo yang dengan parameter
    static void tugashariini(String presentasi) {
        System.out.println("Tugas presentasi: " + presentasi);
    }

    public static void main(String[] args) {

        // ini buat manggil procedur tanpa parameter
        informasihari();

        // ini buat manggil procedur dengan parameter
        tugashariini("Menjelaskan materi selama perkuliahan dalan bentuk kerja kelompok! ");
    }
}
