import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/7/19 16:39
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class 连续最大和 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int max = Integer.MIN_VALUE;
            int cur = 0;
            int n = input.nextInt();
            for (int i = 0; i < n; i++) {
                cur += input.nextInt();
                max = Math.max(max,cur);
                cur = cur < 0 ? 0 : cur;
            }
            System.out.println(max);
        }
    }
}
