package recursiontest;

/**
 * 现在一个人上台阶，可以一次上两个台阶，也可以一次上一个台阶，问当有n个台阶时，一共有多少中方式
 * 分析：
 * 假如第一次上一个台阶，则后面n-1个台阶有f(n-1)种方式。
 * 假如第一次上两个台阶，则后面有f(n-2)种上法
 * f(n) = f(n-1)+f(n-2)
 *
 * @see
 * @since
 */
public class stepUp {
    public static void main(String[] args) {
        System.out.println(stepUpMode(5));
    }

    public static int stepUpMode(int n) {
        if (n <= 2) {
            return n;
        }
        return stepUpMode(n - 1) + stepUpMode(n - 2);
    }
}
