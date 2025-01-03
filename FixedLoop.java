public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        while (x < 5) {
            if (x == 3) {
                x++;
                continue;
            }
            System.out.println(x);
            x++;
        }
    }
}