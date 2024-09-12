package class_5;

// for巢狀迴圈
public class NestForDemoStar {
    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }  
        }
        System.out.println();
    }
}
