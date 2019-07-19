import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/7/19 22:29
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe 正则表达式
 */
class Point{
    int x;
    int y;
}
public class 坐标移动1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String[] strx=str.split(";");
            Point start=new Point();
            for(int i=0;i<strx.length;i++){
                if(strx[i].length()<=3&&strx[i].length()>1){
                    if (strx[i].charAt(0) == 'A' || strx[i].charAt(0) == 'W'
                            || strx[i].charAt(0) == 'S' || strx[i].charAt(0) == 'D') {
                        String num=strx[i].substring(1);
                        /*
                        替换后面的移动步数中的非数字之后，长度不变，
                        [^0-9]配串中不含有0-9的字符
                        */
                        if(num.length() == num.replaceAll("[^0-9]","").length()){
                            start= direction(strx[i],start);
                        }
                    }
                }
            }
            System.out.println(start.x+","+start.y);
        }
    }
    public static Point direction(String str, Point start){
        if(str.charAt(0)=='A'){
            start.x=start.x-Integer.parseInt(str.substring(1));
        }
        if(str.charAt(0)=='W'){
            start.y=start.y+Integer.parseInt(str.substring(1));
        }
        if(str.charAt(0)=='S'){
            start.y=start.y-Integer.parseInt(str.substring(1));
        }
        if(str.charAt(0)=='D'){
            start.x=start.x+Integer.parseInt(str.substring(1));
        }
        return start;
    }
}
