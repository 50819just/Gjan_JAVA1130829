package class_4;
public class Weekday1  
    {public static void main(String[] args)
     {
       int day =(int)(Math.random()*7);
       if(day==0){
       System.out.println(day+"星期天");
       System.out.println("假日");
       }else if(day == 6){
        System.out.println(day+"星期6");
        System.out.println("假日");
       }else{
       System.out.println(day+"星期"+day);
       System.out.println("平常日");
    }
     }
}
