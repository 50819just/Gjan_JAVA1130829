package class_3;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入一個整數:");
        int value = sc.nextInt();
        System.out.println("你輸入數字:" + value);
        sc.close();
    }
}
