package class_5;

public class WhileDemo2 {
    public static void main(String[] args) {
        int value = 60;
        int i = 1;
        while (i < value) {
            if (value % i == 0)
                System.out.println(i + "");
            i++;
        }
    }
}
// 了解 若int數字餘數是0，即可觸發if
//中斷點
