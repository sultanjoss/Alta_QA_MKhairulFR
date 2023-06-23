import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai sisi1 :");
        int sisi1 = input.nextInt();
        System.out.print("Masukkan nilai sisi2  :");
        int sisi2 = input.nextInt();
        System.out.print("masukkan nilai sisi3   :");
        int sisi3 = input.nextInt();


        System.out.print("Masukkan nilai Alas  :");
        int alas = input.nextInt();
        System.out.print("Masukkan nilai Tinggi  :");
        int tinggi = input.nextInt();


        Segitiga segitiga = new Segitiga(sisi1,sisi2,sisi3,alas,tinggi);
        segitiga.kelilingSegitiga();
        segitiga.luasSegitiga();


        System.out.println("====Ternyata pening-pening coding itu mantap yah guys====");
        System.out.println("================");
        System.out.println("                     =======================");

    }
}