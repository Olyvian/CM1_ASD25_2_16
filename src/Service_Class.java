public class Service_Class {
    Transaksi_Pembelian [] Trs;

    Service_Class(Transaksi_Pembelian[] data ) {
        this.Trs = data;
    }

    int Searching(String kodeBarang) {
        int posisi = -1;
        int count = 0;

        for (int i = 0; i < Trs.length; i++) {
            if (Trs[i].brg.kodebarang.equalsIgnoreCase(kodeBarang)) {
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
                if (data[j].brg.kodebarang.compareToIgnoreCase(data[j + 1].brg.kodebarang) > 0) {
                    Transaksi_Pembelian temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}
