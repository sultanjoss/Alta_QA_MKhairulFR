import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi  :");
        int sisi = input.nextInt();

        Persegi persegi = new Persegi(sisi);
        persegi.luasPersegi();
        persegi.keliling();


        System.out.println("====Ternyata coding itu mantap yah guys====");
        System.out.println("================");
        System.out.println("                     =======================");



    }
}
