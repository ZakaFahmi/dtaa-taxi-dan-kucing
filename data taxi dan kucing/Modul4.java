package modul4;

import java.util.Scanner;

public class Modul4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);
        boolean ulang = true;
        while (ulang) {
            System.out.println("Menu :");
            System.out.println("1. Kucing");
            System.out.println("2. Taxi");
            System.out.print("Pilih Menu: ");
            int pilih = angka.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("==================================================");
                    System.out.print("Masukan Nama Kucing : ");
                    String nama = text.nextLine();
                    System.out.print("Masukkan Tanggal Lahir (dd) : ");
                    int hari = angka.nextInt();
                    if (hari > 31) {
                        System.out.println("tidak ada tanggal seperti itu");
                        break;
                    }
                    System.out.print("Masukkan Tanggal Lahir (mm) : ");
                    int bulan = angka.nextInt();
                    if (bulan > 12) {
                        System.out.println("tidak ada bulan seprti itu");
                        break;
                    }
                    System.out.print("Masukkan Tanggal Lahir (yyyy) : ");
                    int tahun = angka.nextInt();
                    if (tahun > 2019) {
                        System.out.println("sekarang masih 2020");
                        break;
                    }
                    kucing mbarang = new kucing();
                    mbarang.setNama(nama);
                    mbarang.setHari(hari);
                    mbarang.setBulan(bulan);
                    mbarang.setTahun(tahun);
                    System.out.println("==================================================");
                    System.out.println("Nama Kucing : " + mbarang.getNama());
                    System.out.println("Tanggal Lahir : " + mbarang.getHari() + "-" + mbarang.getBulan() + "-" + mbarang.getTahun());
                    System.out.println("Umur : " + mbarang.itung() + " Tahun");
                    System.out.println("==================================================");
                    break;

                case 2:
                    System.out.println("==================================================");
                    System.out.print("Masukan Nama Penumpang : ");
                    String namap = text.nextLine();
                    System.out.print("Masukan Nama Driver : ");
                    String namad = text.nextLine();
                    System.out.print("Masukan Jarak Tempuh (KM) : ");
                    int jarak = angka.nextInt();
                    System.out.print("Masukkan Tanggal Pengantaran Penumpang (dd-mm-yyyy): ");
                    String tanggal = text.nextLine();
                    taxi bebas = new taxi();
                    bebas.setNamap(namap);
                    bebas.setNamad(namad);
                    bebas.setJarak(jarak);
                    bebas.setTanggal(tanggal);
                    System.out.println("==================================================");
                    System.out.println("Nama Penumpang : " + bebas.getNamap());
                    System.out.println("Nama Driver : " + bebas.getNamad());
                    System.out.println("Jarak : " + bebas.getJarak());
                    System.out.println("Pada Tanggal : " + bebas.getTanggal());
                    System.out.println("Total Biaya Perjalanan : " + bebas.biaya());
                    System.out.println("==================================================");
                    break;

                default:
                    System.out.println("==================================================");
                    System.out.println("Inputan Anda Salah");
                    System.out.println("==================================================");
                    break;

            }
        }

    }

}
