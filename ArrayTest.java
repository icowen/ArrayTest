public class ArrayTest {
  public static void change(Integer[] test) {
    test[0] = test[1];
    test[2] = test[1];
    test[3] = test[1];
    test[4] = test[1];
  }

  public static void main(String[] args) {
    Integer[] test = new Integer[5];
    for(int i = 0; i<5; i++) {
      test[i] = i;
    }
    change(test);
    for(int a : test) {
      System.out.println(a);
    }
  }
}
