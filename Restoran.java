
    // Kelas Pelanggan
    class Pelanggan {
        private String nama;
        private int nomorMeja;

        // Constructor
        public Pelanggan(String nama, int nomorMeja) {
            this.nama = nama;
            this.nomorMeja = nomorMeja;
        }

        // Getter
        public String getNama() {
            return nama;
        }

        public int getNomorMeja() {
            return nomorMeja;
        }
    }

    // Kelas Menu
    class Menu {
        private String namaMakanan;
        private double harga;

        // Constructor
        public Menu(String namaMakanan, double harga) {
            this.namaMakanan = namaMakanan;
            this.harga = harga;
        }

        // Getter
        public String getNamaMakanan() {
            return namaMakanan;
        }

        public double getHarga() {
            return harga;
        }
    }

    // Kelas Pesanan
    class Pesanan {
        private Pelanggan pelanggan;
        private Menu menu;
        private int jumlah;

        // Constructor
        public Pesanan(Pelanggan pelanggan, Menu menu, int jumlah) {
            this.pelanggan = pelanggan;
            this.menu = menu;
            this.jumlah = jumlah;
        }

        // Method untuk menampilkan pesanan
        public void tampilkanPesanan() {
            System.out.println("Pesanan untuk " + pelanggan.getNama() + " (Meja " + pelanggan.getNomorMeja() + ")");
            System.out.println("Makanan: " + menu.getNamaMakanan() + " | Harga: Rp" + menu.getHarga() + " | Jumlah: " + jumlah);
            System.out.println("Total Bayar: Rp" + (menu.getHarga() * jumlah));
        }
    }

    // Kelas utama untuk menjalankan program
    public class Restoran {
        public static void main(String[] args) {
            // Data pelanggan
            Pelanggan pelanggan1 = new Pelanggan("Adi", 2);

            // Data menu
            Menu menu1 = new Menu("Ayam Bakar", 25000);

            // Pesanan
            Pesanan pesanan1 = new Pesanan(pelanggan1, menu1, 2);

            // Menampilkan pesanan
            pesanan1.tampilkanPesanan();
        }
    }


