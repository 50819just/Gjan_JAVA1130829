package class_5;

public class ForDemo2 {
    public static void main(String[] args) {
        int value = 60;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0)
                System.out.println(i + "");
        }
    }
}
//了解 若int數字餘數是0，即可觸發if
