import java.util.Scanner;
public class MainBalok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai panjang  :");
        int panjang = input.nextInt();
        System.out.print("masukkan nilai lebar   :");
        int lebar = input.nextInt();
        System.out.print("masukkan nilai tinggi   :");
        int tinggi = input.nextInt();


        Balok balok = new Balok(panjang,lebar,tinggi);
        balok.volumeBalok();


        System.out.println("====Ternyata coding itu mantap yah guys====");
        System.out.println("================");
        System.out.println("                     =======================");
    }


}
