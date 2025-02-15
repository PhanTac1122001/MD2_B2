package BaiTap;

import java.util.Scanner;

public class BaiTap7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in: ");
        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;

        while (count < numbers) {

            if (check(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }

    public static boolean check(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

