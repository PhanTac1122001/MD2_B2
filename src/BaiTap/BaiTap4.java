package BaiTap;

import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm toán");
        float math = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm anh");
        float english = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm văn");
        float literature=Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm lý");
        float chemistry=Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm hóa");
        float history=Float.parseFloat(sc.nextLine());

        double diemTB=(math+english+literature+chemistry+history)/5;

        if(diemTB<5&&diemTB>=0){
            System.out.println("Xếp loại yếu"+diemTB);
        }
        else if(diemTB<6.5){
            System.out.println("Xếp loại trung bình"+diemTB);
        } else if (diemTB<8) {
            System.out.println("Xếp loại khá"+diemTB);
        } else if (diemTB<9) {
            System.out.println("Xếp loại giỏi"+diemTB);
        } else {
            System.out.println("Xếp loại xuất sắc"+diemTB);
        }
    }
}
