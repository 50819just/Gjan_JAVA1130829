package class_4;

public class Llght {
  public static void main(String[] args) {
    int x = (int) (Math.random() * 5) + 1;
    switch (x) {
      case 1:
        System.out.println(x + "紅燈");
        break;
      case 2:
        System.out.println(x + "黃燈");
        break;
      default:
        System.out.println(x + "綠燈");
        break;
    }
  }
}