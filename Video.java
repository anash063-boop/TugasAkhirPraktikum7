public class Video extends AsetDigital {
    private int durasiDetik; // atribut khusus Video

    public Video(String id, String namaFile, double ukuranMB, int durasiDetik) {
        super(id, namaFile, ukuranMB);
        this.durasiDetik = durasiDetik;
    }

    // getter : atribut private durasiDetik bisa diakses dari luar class Video
    // jadi disediakan method ini.
    public int getDurasiDetik() {
        return durasiDetik;
    }

    @Override
    public void tampilkanReview() {
        System.out.println("[Video] " + namaFile + " - Durasi: " + durasiDetik + " detik");
    }
}