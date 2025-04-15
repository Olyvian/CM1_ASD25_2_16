public class Service_Class {
    Transaksi_Pembelian [] data=new Transaksi_Pembelian[5];
    int idx;
    Service_Class(Transaksi_Pembelian[] data ) {
        this.data = data;
    }
    void tambahDataTransaksi(Transaksi_Pembelian trs){
        if (idx<data.length) {
            data[idx]=trs;
            idx++;
        }else{
            System.out.println("Data Penuh");
        }
    }
    int Searching(String kodeBarang) {
        int posisi = -1;
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i].brg.kodebarang.equalsIgnoreCase(kodeBarang)) {
                posisi = i;
                count++;
            }
        }

        if (count > 1) {
            System.out.println("Ditemukan lebih dari satu barang dengan kode yang sama");
        }

        return posisi;
    }
    void Sorting(Transaksi_Pembelian[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].brg.kodebarang.compareToIgnoreCase(data[j + 1].brg.kodebarang)>0) {
                    Transaksi_Pembelian temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println("|Kode Transaksi |Nama Pembeli |Tanggal Pembelian |Nama Barang |Kuantitas |Harga |");
        for (Transaksi_Pembelian transaksi_Pembelian : data) {
            transaksi_Pembelian.tampilDataTransaksi();
        }
    }
}
