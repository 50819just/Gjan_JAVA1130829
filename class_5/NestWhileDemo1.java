package class_5;
// while巢狀迴圈
public class NestWhileDemo1 {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 9) {
            int y = 1;
            while (y <= 9) {
                String s = x + "*" + y + "=" + (x * y) + "\t";
                System.out.println(s);
                y++;
            }
            x++;
            System.out.println();
        }
    }
}
