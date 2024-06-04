package ThucHanh;

import java.util.Scanner;

public class ThucHanh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Chiều dài");
        weight = sc.nextDouble();
        System.out.println("Chiều cao");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s","bmi","Interpretation\n");
        if (bmi < 18) {
            System.out.printf("%-20s.2f%s",bmi,"Underweight\n");
        }
        else if (bmi < 25) {
            System.out.printf("%-20s.2f%s",bmi,"Normal\n");
        }
        else if (bmi < 30) {
            System.out.printf("%-20s.2f%s",bmi,"Overweight\n");
        }
        else {
            System.out.printf("%-20s .2f%s",bmi,"Obese\n");
        }
    }
}
