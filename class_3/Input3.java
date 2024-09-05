package class_3;

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入1個整數：");
        int value = sc.nextInt();
        int x = (int) (Math.random() * 3) + 1;
        if (value == x)
            System.out.println("猜對了");
        else
            System.out.println("猜錯了"+x);
        sc.close();
    }
}
