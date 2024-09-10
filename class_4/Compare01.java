package class_4;

public class  Compare01 {
    public static void main (String[] args)
{
    int v1 =(int)(Math.random()*10)+1;
    int v2 =(int)(Math.random()*10)+1;
    System.out.println("v1="+v1+"v2="+v2);

    if (v1>v2)
    System.out.println(v1+">"+v2);
    else if (v1<v2)
    System.out.println(v1+"<"+v2);
    else 
    System.out.println(v1+"=="+v2);
}
}