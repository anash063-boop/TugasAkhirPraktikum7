import java.util.ArrayList;

public class MainAset {
    public static void main(String[] args) {
        ArrayList<AsetDigital> daftarAset = new ArrayList<>();

        // Menambahkan aset ke dalam daftar
        daftarAset.add(new Gambar("G01", "logo.png", 12.5, "1920x1080"));
        daftarAset.add(new Video("V01", "Reels.mp4", 150.0, 300));
        daftarAset.add(new Dokumen("D01", "pendaftaran.pdf", 5.0, 10));
        daftarAset.add(new VideoPromosi("VP01", "promosi.mp4", 100.0, 120, "TikTok"));

        System.out.println("===== Preview Semua Aset Digital =====");
        for (AsetDigital aset : daftarAset) {
            aset.getInfo();
            aset.tampilkanReview();
            System.out.println();
        }

        System.out.println("===== Aset yang Dapat Dipromosikan =====");
        for (AsetDigital aset : daftarAset) {
            if (aset instanceof DapatDipromosikan) {
                DapatDipromosikan p = (DapatDipromosikan) aset;
                p.promosi();
                p.infoPromosi();
            }
        }

        System.out.println("\n===== Daftar Promosi (via interface) =====");
        ArrayList<DapatDipromosikan> daftarPromosi = new ArrayList<>();
        daftarPromosi.add(new VideoPromosi("VP02", "Reels Instagram.mp4", 100.0, 120, "Instagram"));
        for (DapatDipromosikan promosi : daftarPromosi) {
            promosi.promosi();
            promosi.infoPromosi();
        }
    }
}