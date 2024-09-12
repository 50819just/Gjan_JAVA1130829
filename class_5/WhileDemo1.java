package class_5;

public class WhileDemo1 {
    public static void main(String[] args) {
        int total = 0;
        int i = 1;
        while (i < 10) {
            if (i < 10)
                System.out.println(i + "+");
            else
                System.out.println(i + "=");
            total += i;
            i++;
        }
        System.out.println(total);
    }
}
