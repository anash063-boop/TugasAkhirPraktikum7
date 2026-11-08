public abstract class AsetDigital {
    // protected : bisa diakses oleh class ini dan subclassnya
    protected String id;
    protected String namaFile;
    protected double ukuranMB;
    
    // Constructor : dipanggil subnclass lewat super()
    public AsetDigital(String id, String namaFile, double ukuranMB) {
        this.id = id;
        this.namaFile = namaFile;
        this.ukuranMB = ukuranMB;
    }
    
    // method abstract : hanya deklarasi, tanpa isi
    // setiap supclass konkret wajib men-override method ini
    public abstract void tampilkanReview();

    // method konkret : punya i
    public void getInfo () {
        System.out.println("ID : " + id);
        System.out.println("Nama File : " + namaFile);
        System.out.println("Ukuran : " + ukuranMB + " MB");
    }
}