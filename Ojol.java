// Kelas Pengguna (Pelanggan)
class Pengguna {
    private String nama;
    private String lokasiPenjemputan;

    // Constructor
    public Pengguna(String nama, String lokasiPenjemputan) {
        this.nama = nama;
        this.lokasiPenjemputan = lokasiPenjemputan;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getLokasiPenjemputan() {
        return lokasiPenjemputan;
    }
}

// Kelas Driver (Pengemudi)
class Driver {
    private String nama;
    private String kendaraan;
    private boolean tersedia;
    private double rating;
    private String lokasiSekarang;

    // Constructor
    public Driver(String nama, String kendaraan, boolean tersedia, double rating, String lokasiSekarang) {
        this.nama = nama;
        this.kendaraan = kendaraan;
        this.tersedia = tersedia;
        this.rating = rating;
        this.lokasiSekarang = lokasiSekarang;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getKendaraan() {
        return kendaraan;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public double getRating() {
        return rating;
    }

    public String getLokasiSekarang() {
        return lokasiSekarang;
    }
}

// Kelas Utama Ojol (Main Class)
public class Ojol {
    public static void main(String[] args) {
        // Hardcoded data Pengguna dan Driver
        Pengguna pengguna1 = new Pengguna("Aldi", "Jalan Merdeka, Jakarta");

        Driver driver1 = new Driver("Budi", "Honda Vario", true, 4.9, "Jalan Sudirman, Jakarta");
        Driver driver2 = new Driver("Dani", "Yamaha NMAX", true, 4.5, "Jalan Merdeka, Jakarta");

        // Simulasi pemilihan driver berdasarkan lokasi dan rating
        Driver driverTerpilih = null;

        if (driver1.isTersedia() && driver1.getLokasiSekarang().equals(pengguna1.getLokasiPenjemputan())) {
            driverTerpilih = driver1;
        } else if (driver2.isTersedia() && driver2.getLokasiSekarang().equals(pengguna1.getLokasiPenjemputan())) {
            driverTerpilih = driver2;
        }

        // Menampilkan hasil pemesanan
        System.out.println("=== Aplikasi Ojek Online ===");
        System.out.println("Pelanggan: " + pengguna1.getNama());
        System.out.println("Lokasi Penjemputan: " + pengguna1.getLokasiPenjemputan());

        if (driverTerpilih != null) {
            System.out.println("\nDriver Terpilih:");
            System.out.println("Nama: " + driverTerpilih.getNama());
            System.out.println("Kendaraan: " + driverTerpilih.getKendaraan());
            System.out.println("Rating: " + driverTerpilih.getRating());
            System.out.println("Lokasi Sekarang: " + driverTerpilih.getLokasiSekarang());
            System.out.println("\nStatus: Driver sedang menuju lokasi penjemputan...");
        } else {
            System.out.println("\nMaaf, tidak ada driver yang tersedia di lokasi Anda.");
        }
    }
}
