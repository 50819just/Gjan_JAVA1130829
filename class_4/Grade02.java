package class_4;
import java.util.*;
public class Grade02 {
    public static void main(String[] args)
    {
       int v1=(int)(Math.random()*100)+1;
       if(v1%2==0)
       System.out.println(v1+"偶數");
       else
       System.out.println(v1+"奇數");
       String S=v1%2==0 ? v1+"偶數":v1+"奇數";
       System.out.println(S);
    }
}
