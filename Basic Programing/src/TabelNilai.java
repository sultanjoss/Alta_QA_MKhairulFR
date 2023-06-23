
import java.util.Scanner;

public class TabelNilai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("---Konversi Nilai Mahasiwa---");
        System.out.print(" Masukkan Nama : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Nilai :");
        int nilai = scan.nextInt();

        if (nilai >= 80) {
            if (nilai <=100)
                System.out.println(" Mendapatkan Nilai A ");
        }
        if (nilai >= 65) {
            if (nilai <=79)
                System.out.println(" Mendapatkan nilai B+");
        }
        if (nilai >=50) {
            if (nilai <=64)
                System.out.println(" Mendapatkan nilai B");
        }
        if (nilai >=35) {
            if (nilai <=49)
                System.out.println(" Mendapatkan nilai C");
        }
        if (nilai >=0) {
            if (nilai <=34)
                System.out.println(" Mendapatkan nilai D");
        }
        if (nilai <0) {
            if (nilai >100)
                System.out.println(" Invalid Bosku");
        }
        else {
            System.out.println("Coba lagi ini Ujian yah guys");
        }
    }
}
