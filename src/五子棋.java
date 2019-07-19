import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/7/18 21:44
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class 五子棋 {
    public static boolean cheakDown(String[] strings,int row, int col) {
        char c = strings[row].charAt(col);
        for (int i = 0; i < 4; i++) {
            if (c != strings[row + i + 1].charAt(col)) {
                return false;
            }
        }
        return true;
    }
    public static boolean cheakRight(String[] strings, int row, int col) {
        char c = strings[row].charAt(col);
        for (int i = 0; i < 4; i++) {
            if (c != strings[row].charAt(col + 1 + i)) {
                return false;
            }
        }
        return true;
    }
    public static boolean cheakRightDown(String[] strings, int row, int col) {
        char c = strings[row].charAt(col);
        for (int i = 0; i < 4; i++) {
            if (c != strings[row + 1 + i].charAt(col + 1 + i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String[] strings = new String[20];
            for (int i = 0; i < strings.length; i++) {
                strings[i] = input.nextLine();
            }
            boolean judge = false;
            for (int i = 0; i <= 15; i++) {
                for (int j = 0; j <= 15; j++) {
                    if (strings[i].charAt(j) != '.' &&  (cheakDown(strings,i,j) || cheakRight(strings,i,j) || cheakRightDown(strings,i,j))) {
                        judge = true;
                    }
                }
            }
            for (int i = 0; i <= 15; i++) {
                for (int j = 16; j < 20; j++) {
                    if (strings[i].charAt(j) != '.' && cheakDown(strings,i,j)) {
                        judge = true;
                    }
                }
            }
            for (int i = 16; i < 20; i++) {
                for (int j = 0; j <= 15; j++) {
                    if (strings[i].charAt(j) != '.' && cheakRight(strings,i,j)) {
                        judge = true;
                    }
                }
            }
            if (judge) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
