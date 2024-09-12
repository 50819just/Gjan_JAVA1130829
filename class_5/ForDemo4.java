package class_5;

public class ForDemo4 {
    public static void main(String[] args) {
        int value = 1234;
        int count = 0;
        for ( ;value > 0; value = value / 10)
        {
            count++;
        }
        System.out.println(count);
    }
}
