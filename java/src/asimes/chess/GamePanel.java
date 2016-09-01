package asimes.chess;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by lianglab on 2016/8/31.
 * 功能 ：
 */
public class GamePanel {
    public static void main(String[] args) {
        System.out.println("请输入初始参数,设置棋盘的大小,例如 10 10（表示创建一个大小为10x10的棋盘）:");
        Scanner scanner = new Scanner(System.in);
        int width = 15;
        int height = 15;
        try {

            width = scanner.nextInt();
            height = scanner.nextInt();
        }catch (InputMismatchException exception){

        }
        ChessPanel cp = new ChessPanel(width,height);
        cp.printPanel();
        System.out.println("黑棋先下，请输入黑棋的坐标：例如 1 3");
        String str;
        int x =0;
        int y =0;
        while (cp.isContinuable()){
            try{
                str = scanner.next();
                if(str.equals("re")){
                    cp.retract();
                }else if (str.equals("exit") || str.equals("quit")){
                    System.exit(0);
                }else {
                    x = Integer.parseInt(str);
                    y = scanner.nextInt();
                    Chess chess = new Chess(x,y,cp.getNextChessColor());
                    cp.addChess(chess);
                }

                cp.printPanel();
                cp.printNextChessColor();
            }catch (NumberFormatException e){
                System.out.println("输入位置有误，请重新输入");
            }catch (InputMismatchException exception){

            }

        }
        cp.end();
    }
}
