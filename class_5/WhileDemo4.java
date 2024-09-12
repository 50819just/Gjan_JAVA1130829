package class_5;

public class WhileDemo4 {
    public static void main(String[] args) {
        int value = 654321;
        int count = 0;
        while (value > 0) {
            value = value / 10;
            count++;
        }
        System.out.println(count);
    }
}
