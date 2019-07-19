import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/7/19 17:57
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class 坐标移动 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String str = input.nextLine();
            String[] strings = str.split(";");
            int x = 0;
            int y = 0;
            for (int i = 0; i < strings.length; i++) {
                String op =  null;
                if (strings[i].length() > 2) {
                    op = strings[i].substring(0,1);
                    int move = 0;
                    try {
                        move = Integer.parseInt(strings[i].substring(1));
                    } catch (NumberFormatException e) {
                        continue;
                    }
                    if (op.equals("A")) {
                        x -= move;
                    } else if (op.equals("W")) {
                        y += move;
                    } else if (op.equals("D")) {
                        x += move;
                    } else if (op.equals("S")) {
                        y -= move;
                    }
                }
            }
            System.out.println(x + "," + y);
        }
    }
}
