import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alas, tinggi, LuasSegitiga;
        System.out.println("-------Menghitung luas segitiga---------");
        System.out.print("Masukkan alas :");
        alas = input.nextInt();
        System.out.print("Masukkan tinggi :");
        tinggi = input.nextInt();
        LuasSegitiga = (alas * tinggi) / 2;

        System.out.println("Luas Segitiga adalah "+ LuasSegitiga );
        System.out.println("---Berakitrakit kehulu, Berenang-renang kemudian");
        System.out.println("-------------------------------------------------");

    }
}