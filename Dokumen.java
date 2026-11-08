public class Dokumen extends AsetDigital {
    private int jumlahHalaman; // atribut khusus Dokumen

    public Dokumen(String id, String namaFile, double ukuranMB, int jumlahHalaman) {
        super(id, namaFile, ukuranMB);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void tampilkanReview() {
        System.out.println("[Dokumen] " + namaFile + " - Jumlah Halaman: " + jumlahHalaman);
    }
}