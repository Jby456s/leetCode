package recursiontest;

/**
 * 用递归的方式实现斐波那契数列
 * 斐波那契数列说明：f(n) = f(n-1)+f(n-2)
 *
 * @see
 * @since
 */
public class FibonacciTest {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    // 定义函数，明确用来生成斐波那契数列
    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
