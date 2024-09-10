package class_4;

public class Compare02 {
    public static void main(String[]args)
{
   int v1 =(int)(Math.random()*10+1);
   int v2 =(int)(Math.random()*10+1);
   int v3 =(int)(Math.random()*10+1);
   System.out.println("v1="+v1+"v2"+v2+"v3="+v3);
   if(v1>v2)
   {if(v1>v3)
    System.out.println("max;"+v1);
    else
    System.out.println("max;"+v3);
   }else{
    if(v2>v3)
    System.out.println("max:"+v2);
    else
    System.out.println("max"+v3);
   }
}
}