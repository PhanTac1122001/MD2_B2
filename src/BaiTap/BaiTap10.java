package BaiTap;

import java.util.Scanner;

public class BaiTap10 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double side1, side2, side3;

            while (true) {
                System.out.print("Nhập độ dài cạnh 1 của tam giác: ");
                side1 = scanner.nextDouble();
                System.out.print("Nhập độ dài cạnh 2 của tam giác: ");
                side2 = scanner.nextDouble();
                System.out.print("Nhập độ dài cạnh 3 của tam giác: ");
                side3 = scanner.nextDouble();


                if (side1 > 0 && side2 > 0 && side3 > 0 && side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {

                    double perimeter = side1 + side2 + side3;
                    System.out.printf("Chu vi của tam giác là: %.2f\n", perimeter);


                    double s = (side1 + side2 + side3) / 2;
                    double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
                    System.out.printf("Diện tích của tam giác là: %.2f\n", area);
                    break;
                } else {
                    System.out.println("Các cạnh không tạo thành một tam giác hợp lệ. Vui lòng nhập lại.");
                }
            }

            scanner.close();
        }

}
