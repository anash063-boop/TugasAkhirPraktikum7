public interface DapatDipromosikan {

    // method abstract : hanya deklarasi, tanpa isi
    // setiap class yang mengimplementasikan interface ini wajib men-override method ini
    public void promosi();

    // Default method : punya is bawaan, class yg mengimplementasikan interface ini bisa langsung memanggil method ini tanpa harus men-override
    default void infoPromosi() {
        System.out.println("Aset ini dapat dipromosikan di media sosial.");
    }
}