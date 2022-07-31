public class SetValueOptTest {
  public static void main(String args[]) {
    short s1 = 1;
    // s1 = s1 + 2; // 编译出错，int型不能赋值给short型
    s1 += 2; // += -=... 不会改变数据类型
    System.out.println(s1); // 3

    int n1 = 1;
    n1 *= 0.1;
    System.out.println(n1); // 0
  }
}
