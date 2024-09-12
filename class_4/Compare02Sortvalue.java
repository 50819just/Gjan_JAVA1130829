package class_4;

public class Compare02Sortvalue {
    public static void main(String[] args) 

      { int v1 = (int) (Math.random() * 10) + 1;
        int v2 = (int) (Math.random() * 10) + 1;
        int v3 = (int) (Math.random() * 10) + 1;
        System.out.println("v1=" + v1 + "v2=" + v2 + "v3=" + v3);
        if(v1>v2){
        int temp =v1;
        v1=v2;
        v2=temp;
       }
        if(v1>v3){
            int temp=v1;
            v1=v3;
            v3=temp;
        }
        if(v2>v3){
            int temp=v2;
            v2=v3;
            v3=temp ;
        }
    }
}
