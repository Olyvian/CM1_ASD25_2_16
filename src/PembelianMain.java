import java.util.Scanner;

public class PembelianMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Barang[] brg = new Barang[3];
        brg[0] = new Barang("A01", "Barang 1", "Kategori 1", 5, 1000);
        brg[1] = new Barang("A02", "Barang 2", "Kategori 2", 10, 2000);
        brg[2] = new Barang("A03", "Barang 3", "Kategori 3", 15, 3000);

        
        Transaksi_Pembelian[] trs = new Transaksi_Pembelian[3];
        trs[0] = new Transaksi_Pembelian("trs01", "Olyvian", "14/04/2025", 2, brg[2]);
        trs[1] = new Transaksi_Pembelian("trs02", "Olyvian", "16/04/2025", 4, brg[1]);
        trs[2] = new Transaksi_Pembelian("trs03", "Fajar", "17/04/2025", 6, brg[0]);
        
        Service_Class service = new Service_Class(trs);
        
        while (true) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Pengurutan Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.println("Data Barang");
                    System.out.println("|Kode Barang |Nama Barang |Stok Barang |Harga Barang |");
                    for (Barang barang : brg) {
                        barang.tampilDataBarang();
                    }
                    break;

                case 2:
                    System.out.println("Data Transaksi");
                    System.out.println("|Kode Transaksi |Nama Pembeli |Tanggal Pembelian |Nama Barang |Kuantitas |Harga |");
                    for (Transaksi_Pembelian transaksi : trs){
                        transaksi.tampilDataTransaksi();
                    }
                    break;

                case 3:
                    System.out.print("Masukkan kode barang yang dicari: ");
                    String kode = input.nextLine();

                    int pos = service.Searching(kode);

                    if (pos != -1) {
                        System.out.println("Data ditemukan:");
                        System.out.println("|Kode Transaksi |Nama Pembeli |Tanggal Pembelian |Nama Barang |Kuantitas |Harga |");
                        trs[pos].tampilDataTransaksi();
                    } else {
                        System.out.println("Barang tidak ditemukan");
                    }
                    break;

                case 4:
                System.out.println("Sorting ASC");
                service.Sorting(trs); 
                System.out.println("|Kode Transaksi |Nama Pembeli |Tanggal Pembelian |Nama Barang |Kuantitas |Harga |");
                for (Transaksi_Pembelian transaksi : trs) {
                    transaksi.tampilDataTransaksi();
                }
                    break;

                case 5:
                    System.out.println("Terima kasih");
                    return;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih lagi");
            }
        }
    }
}
