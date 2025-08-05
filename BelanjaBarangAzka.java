import java.util.Scanner;

public class BelanjaBarangAzka {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("Masukkan Nama Barang");
        String namaBarang = input.nextLine();
        System.out.println("Masukkan Harga Barang");
        int hargaBarang = input.nextInt();

      
        System.out.println("Masukkan Nama Barang2");
        String namaBarang2 = input.next();
        System.out.println("Masukkan Harga Barang2");
        int hargaBarang2 = input.nextInt();

        System.out.println("============");
        System.out.println("Nama: "+namaBarang);
        System.out.println("Harga: "+hargaBarang);

        System.out.println("============");
        System.out.println("Nama: "+namaBarang2);
        System.out.println("Harga: "+hargaBarang2);

    }
}
