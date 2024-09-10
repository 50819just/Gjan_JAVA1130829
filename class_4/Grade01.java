package class_4;
import java.util.*;
public class Grade01 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("輸入分數(1~100):");
        int Score =sc.nextInt();
        if(Score>=90)
        System.out.println(Score+"A");
        else if(Score>=80)
        System.out.println(Score+"B");
        else if(Score>=70)
        System.out.println(Score+"C");
        else if(Score>=60)
        System.out.println(Score+"D");
        else 
        System.out.println(Score+"F");
    }
}
