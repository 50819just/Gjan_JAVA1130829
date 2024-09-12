package class_5;

import java.util.Scanner;

public class ChoseMathGuess {
    public static void main(String[] args) {
        int guess = 0;
        int sys = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("猜1~100數字");
            guess = sc.nextInt();
            if (guess > sys) {
                System.out.println("猜錯了");
                System.out.println(guess + "太大");
            } else if (guess < sys) {
                System.out.println("猜錯了");
                System.out.println(guess + "太小");
            } else {
                System.out.println("Bingo");
                break;
            }
        } sc.close();
    }
}
