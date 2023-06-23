import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        double[] numArray = {43.7, 62.5, 29.6, 18.34, 29.0, 90.6};
        double sum = 0.0;

        for (double num: numArray) {
            sum += num;
        }
        double average = sum / numArray.length;
        System.out.println("Nilai rata-ratanya adalah  :" + average);

    }
}
