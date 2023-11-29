import java.util.Scanner;

public class faktur extends dataPembelian { 
    @Override
    public void isidata() {
        Scanner intType = new Scanner(System.in);
        Scanner strType = new Scanner(System.in);

        System.out.print("inputkan nomor faktur   : ");
        nofaktur = strType.nextLine();
        System.out.print("inputkan nama pelanggan : ");
        namaPelanggan = strType.nextLine();
        System.out.print("inputkan nomor HP       : ");
        noHP = strType.nextLine();
        System.out.print("inputkan nama barang    : ");
        namaBarang = strType.nextLine();
        System.out.print("inputkan harga barang   : ");
        try {
            hargaBarang = intType.nextInt();
            if (hargaBarang < 1 || hargaBarang > 996000) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("inputkan nilai yang valid");
        }
        System.out.print("inputkan jumlah beli    : ");
        try {
            jumlahBeli = intType.nextInt();
            if (jumlahBeli < 1 || jumlahBeli > 996000) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("inputkan nilai yang valid");
        }



        totalBayar = hargaBarang * jumlahBeli;

        
    }

    @Override
    public void cetakFaktur() {
        System.out.println("\n  *pembelian sukses*");
        System.out.println("no faktur      : " + nofaktur);
        System.out.println("nama pelanggan : " + namaPelanggan);
        System.out.println("no HP          : " + noHP);
        System.out.println("nama barang    : " + namaBarang);
        System.out.println("harga barang   : " + hargaBarang);
        System.out.println("jumlah beli    : " + jumlahBeli);
        System.out.println("total bayar    : " + totalBayar);
    }

}
