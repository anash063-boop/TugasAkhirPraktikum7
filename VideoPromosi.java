public class VideoPromosi extends Video implements DapatDipromosikan {
    private String platform; // atribut khusus VideoPromosi

    public VideoPromosi(String id, String namaFile, double ukuranMB, int durasiDetik, String platform) {
        super(id, namaFile, ukuranMB, durasiDetik);
        this.platform = platform;
    }

    @Override
    public void tampilkanReview() {
        System.out.println("[VideoPromosi] " + namaFile + " -Durasi: " + getDurasiDetik() + " detik (Platform Promosi: " + platform + ")");
    }

    @Override 
    public void promosi() {
        System.out.println("Mempromosikan Video " + namaFile + "' di " + platform + "!");
    }
}