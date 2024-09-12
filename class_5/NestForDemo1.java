package class_5;

// for巢狀迴圈
public class NestForDemo1 {
    public static void main(String[] args) {
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 12; y++) {
                String s = x + "*" + y + "=" + (x * y) + "\t";
                System.out.println(s);
            }
        }
        System.out.println();
    }
}
