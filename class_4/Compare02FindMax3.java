package class_4;

public class Compare02FindMax3 {
    public static void main(String[] args) {
        int v1 = (int) (Math.random() * 10) + 1;
        int v2 = (int) (Math.random() * 10) + 1;
        int v3 = (int) (Math.random() * 10) + 1;
        System.out.println("v1=" + v1 + "v2=" + v2 + "v3=" + v3);
        int temp = v1;
        v1 = v2;
        v2 = temp;
        System.out.println("v1=" + v1 + "v2=" + v2);
    }
}