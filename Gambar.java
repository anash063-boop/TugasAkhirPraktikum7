// "extends" = pewaris ( inheritance) : Gambar mewarisi atribut dan method dari AsetDigital
public class Gambar extends AsetDigital {
    private String resolusi; // atribut khusus Gambar
    
    public Gambar(String id, String namaFile, double ukuranMB, String resolusi) {
        super(id, namaFile, ukuranMB); // memanggil constructor parent (AsetDigital) lewat super()
        this.resolusi = resolusi;
    }
    
    // Override = mengoverride method abstract dari parent dengan isi yg sesuai
    @Override
    public void tampilkanReview() {
        System.out.println("[Gambar] " + namaFile + " | Resolusi: " + resolusi);
    }
}