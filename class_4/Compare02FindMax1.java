package class_4;

public class Compare02FindMax1 {
    public static void main(String[] args) {
        int v1 = (int) (Math.random() * 10) + 1;
        int v2 = (int) (Math.random() * 10) + 1;
        int v3 = (int) (Math.random() * 10) + 1;
        System.out.println("v1=" + v1 + "v2=" + v2 + "v3=" + v3);
        int max = v1;
        if (max < v2)
            max = v2;
        if (max < v3)
            max = v3;
            System.out.println("max:"+max);
    }
}