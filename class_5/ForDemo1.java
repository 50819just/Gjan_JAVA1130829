package class_5;

public class ForDemo1 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            if (i < 10)
                System.out.println(i + "+");
            else
                System.out.println(i + "=");
            total += i;
        }
        System.out.println(total);
    }
}
// 知道要迴圈幾次
//迴圈情境例如= 資料庫，不斷更新，資料 ，跑迴圈
//事件互動，為JS非JAVA
