package class_5;

public class WhileDemo3 {
    public static void main(String[] args) {
        int value = 60;
        int i = 1, count = 0;
        while (i <= value) {
            if (value % i == 0)
                count++;
            i++;
        }
        if (count == 2)
            System.out.println(value + "質數");
        else
            System.out.println(value + "不是質數");
    }
}
// 了解 若int數字餘數是0，即可觸發if
// 中斷點
