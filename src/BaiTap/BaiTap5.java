package BaiTap;

import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị ban đầu:");
        int firstNum = sc.nextInt();
        System.out.println("Nhập giá trị kết thúc:");
        int secondNum = sc.nextInt();

        int sum=0;

        for (int i = firstNum; i <= secondNum; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.printf("Tổng các số chẵn trong khoảng từ %d đến %d là: %d", firstNum, secondNum, sum);
    }
}
