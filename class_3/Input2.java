package class_3;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入字串:");
        String AA = sc.next();
        System.out.println(AA);
        System.out.println("輸入小數:");
        double d = sc.nextDouble();
        System.err.println("你輸入:" + d);
        sc.close();
    }
}
