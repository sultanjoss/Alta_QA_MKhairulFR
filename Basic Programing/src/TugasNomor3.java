import java.util.Scanner;
public class TugasNomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Bilangan : ");
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
    }
}

