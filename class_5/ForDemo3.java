package class_5;

public class ForDemo3 {
    public static void main(String[] args) {
        int value = 17;
        int count = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println(value + "質數");
        else
            System.out.println(value + "此非質數");

    }
}
// 了解 若int數字餘數是0，即可觸發if
