import java.util.Scanner;

public class InputanData {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nama");
        String namaSiswa = input.nextLine();
        System.out.println("Masukkan Usia");
        int usia = input.nextInt();

        System.out.println("============");
        System.out.println("Nama: "+namaSiswa);
        System.out.println("Usia: "+usia);

    }
}
