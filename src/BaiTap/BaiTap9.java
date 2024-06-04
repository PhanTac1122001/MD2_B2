package BaiTap;

import java.util.Scanner;

public class BaiTap9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Chọn hình để tính chu vi và diện tích:");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình tam giác");
            System.out.println("3. Hình tròn");
            System.out.println("4. Thoát");

            System.out.print("Nhập lựa chọn của bạn (1-4): ");
            int number= scanner.nextInt();


            switch (number) {
                case 1:
                    System.out.print("Nhập chiều dài: ");
                    double length = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng: ");
                    double width = scanner.nextDouble();
                    double chuviChunhat = 2 * (length + width);
                    double dientichChunhat = length * width;
                    System.out.printf("Chu vi hình chữ nhật: %.2f\n", chuviChunhat);
                    System.out.printf("Diện tích hình chữ nhật: %.2f\n", dientichChunhat);
                    break;
                case 2:
                    System.out.print("Nhập cạnh a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Nhập cạnh b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Nhập cạnh c: ");
                    double c = scanner.nextDouble();
                    double s = (a + b + c) / 2;
                    double chuviTamgiac = a + b + c;
                    double dientichTamgiac = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                    System.out.printf("Chu vi hình tam giác: %.2f\n", chuviTamgiac);
                    System.out.printf("Diện tích hình tam giác: %.2f\n", dientichTamgiac);
                    break;
                case 3:
                    System.out.print("Nhập bán kính: ");
                    double radius = scanner.nextDouble();
                    double chuviHinhtron = 2 * Math.PI * radius;
                    double dientichHinhtron = Math.PI * radius * radius;
                    System.out.printf("Chu vi hình tròn: %.2f\n", chuviHinhtron);
                    System.out.printf("Diện tích hình tròn: %.2f\n", dientichHinhtron);
                    break;
                case 4:
                    System.out.println("Tạm biệt!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }
}

