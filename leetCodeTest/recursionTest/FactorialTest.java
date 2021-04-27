package recursiontest;

/**
 * 用递归的方式实现阶乘
 * n! = n*(n-1)*....*1;
 *
 * @see
 * @since
 */
public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(factorial(8));
    }

    // 函数需要做什么
    public static int factorial(int n) {
        // 递归结束条件
        if (n == 1 || n == 0) {
            return 1;
        }
        // 函数等价关系式
        return factorial(n - 1) * n;
    }
}
