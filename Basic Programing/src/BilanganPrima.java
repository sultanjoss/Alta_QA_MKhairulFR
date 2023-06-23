import java.util.Scanner;
public class BilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka  : ");
        int bil = input.nextInt();
        boolean prima = true;
        boolean noprima = false;



        for (int i=2; i<bil; i++){
            if (bil%1==0){
                prima = false; break;
            }
        }

        if (prima)
            System.out.print(bil +  "merupakan bilangan prima");
        else
            System.out.print(bil +  "bukan bilangan prima");
    }
}