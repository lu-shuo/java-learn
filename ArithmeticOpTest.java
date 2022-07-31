public class ArithmeticOpTest {
  public static void main(String args[]) {
    int num1 = 12;
    int num2 = 5;
    int res1 = num1 / num2;
    double res2 = num1 / num2;
    double res3 = (double)num1 / num2;
    System.out.println(res1); // 2 int类型只保留整数部分
    System.out.println(res2); // 2 int类型只保留整数部分
    System.out.println(res3); // 2.4

    // 取模运算的结果符号与被模数相同
    int m1 = 12;
    int n1 = 5;
    System.out.println("m1 % n1 = " + m1 % n1);
    int m2 = 12;
    int n2 = -5;
    System.out.println("m2 % n2 = " + m2 % n2);
    int m3 = -12;
    int n3 = 5;
    System.out.println("m3 % n3 = " + m3 % n3);
    int m4 = -12;
    int n4 = -5;
    System.out.println("m4 % n4 = " + m4 % n4);

    byte b1 = 127;
    b1++; // -128 自增或自减运算不会改变本身类型，为二进制运算
    System.out.println(b1);
  }
}
