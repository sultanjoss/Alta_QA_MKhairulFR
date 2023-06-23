import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai sisi 1  :");
        int sisi1 = input.nextInt();
        System.out.print("Masukkan nilai sisi2   :");
        int sisi2 = input.nextInt();
        System.out.print("Masukkan nilai sisi3   :");
        int sisi3 = input.nextInt();


        Kubus kubus = new Kubus(sisi1,sisi2,sisi3);
        kubus.volumeKubus();

        System.out.println("====Ternyata coding itu mantap yah guys====");
        System.out.println("================");
        System.out.println("                     =======================");


    }
}
