package class_3;

public class Input4 {
    public static void main(String[] args) {
        int v1 = (int) (Math.random() * 3) + 1;
        int v2 = (int) (Math.random() * 3) + 1;
        if (v1 > v2) {
            System.out.println("v1比較大");
            System.out.println("v2=" + v1 + "v2=" + v2);
        }
        if (v1 < v2) {
            System.out.println("v2比較大");
            System.out.println("v1=" + v1 + "v2=" + v2);
        }

    }
}
