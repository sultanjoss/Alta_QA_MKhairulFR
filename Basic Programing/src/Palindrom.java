import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String kata;
        String kataPalindrom = "";
        int panjangKata;

        System.out.println("\t Menentukan kata Palindrom \n");
        System.out.print(" Inputan Kata   :");
        kata = userInput.nextLine();

        panjangKata = kata.length();

        for (int i = panjangKata -1; i >=0; i--){
            kataPalindrom = kataPalindrom + kata.charAt(i);
        }

        if (kata.equals(kataPalindrom)){
            System.out.println("\n kata " + kata + " Termasuk kata Palindrom");
        }
        else {
            System.out.println("\n kata " + kata + " Bukan kata palindrom");
        }


    }
}
