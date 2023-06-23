import java.util.Scanner;

public class DrawXYZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\\\\\\Kotak XYZ/////");
        System.out.print("Masukkan nilai angka  :");
        int tinggi = input.nextInt();
        depoXYZ(tinggi);

    }

    public static void depoXYZ(int height) {
        char[] simbol = {'X', 'Y', 'Z'};
        int symbolIndek = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((i + j) % 3 == 0) {
                    System.out.println(simbol[0]);

                } else {
                    if ((i + j) % 2 == 0) {
                        System.out.println(simbol[2]);
                    } else {
                        System.out.println(simbol[1]);
                    }
                }

            }
        }
    }
}


