package class_2;

public class type4_1 {

    public static void main(String[] args) {
        {
            int x = 10;
            int y = 4;
            double d1 = 1.0 * x / y;
            System.out.println(d1);
        }

        {
            int x = 10;
            int y = 3;
            int z = x % y;
            System.out.println(z);
        }

        {
            String s = "Hello" + 1 + 2 + 3;
            System.out.println(s);
            String s2 = 1 + 2 + 3 + "Hello";
            System.out.println(s2);
            String s3 = "Hello" + 1 + 2 * 3;
            System.out.println(s3);
        }
        {
        int x=2; 
        int y=x++;
        System.out.println("x="+x);
        System.out.println("y="+y);
        }
        {
            int x=2; 
            int y=++x;
            System.out.println("x="+x);
            System.out.println("y="+y);
            }
    }
}
