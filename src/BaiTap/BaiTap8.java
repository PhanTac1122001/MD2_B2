package BaiTap;

import java.util.Scanner;

public class BaiTap8 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            int number = scanner.nextInt();


            switch (number) {
                case 1:
                    checkEvenOdd();
                    break;
                case 2:
                    checkPrime();
                    break;
                case 3:
                    checkDivisibleBy3();
                    break;
                case 4:
                    System.out.println("Chương trình kết thúc.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("------- MENU -------");
        System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
        System.out.println("2. Kiểm tra số nguyên tố");
        System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
        System.out.println("4. Thoát");
    }

    private static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }
    }

    private static void checkPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }
    }

    private static void checkDivisibleBy3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println(number + " chia hết cho 3.");
        } else {
            System.out.println(number + " không chia hết cho 3.");
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
