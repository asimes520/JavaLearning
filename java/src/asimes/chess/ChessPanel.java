package asimes.chess;

import java.util.Stack;

/**
 * Created by lianglab on 2016/8/31.
 * 功能 ：
 */
public class ChessPanel {
    public static final char CHESS_NULL = '*';
    public static final char CHESS_BLACK = '●';
    public static final char CHESS_WHITE = '○';

    public static final String WORD_SPACE = " ";

    public static final int CHESS_INT_NULL = -1;
    public static final int CHESS_INT_BLACK = 0;
    public static final int CHESS_INT_WHITE = 1;

    public static final int STATUS_INIT = 0;
    public static final int STATUS_CONTINUABLE = 1;
    public static final int STATUS_BLACK_WIN = 2;
    public static final int STATUS_WHITE_WIN = 3;
    public static final int STATUS_FULL = 4;

    /**
     * 下一步该黑棋下
     */
    public static final int CHESS_NEXT_BLACK = 0;

    /**
     * 下一步该白棋下
     */
    public static final int CHESS_NEXT_WHITE = 1;


    /**
     * 设置赢棋时的棋子连接数
     * 此时为5子棋
     */
    private static final int WIN_SIZE = 5;

    /**
     * 默认棋盘大小
     */
    private  int HEIGHT = 15;
    private  int WIDTH = 15;

    private int status = STATUS_INIT;

    private int[][] panel ;
    private int count = 0;
    private int nextChessColor =0;

    //记录棋子顺序
    private Stack<Chess> chessStack = new Stack<Chess>();

    public ChessPanel() {
        initPanel();
    }

    public  ChessPanel(int width, int height){
        this.HEIGHT = height;
        this.WIDTH = width;
        initPanel();
    }

    private void initPanel() {
        panel = new int[WIDTH][HEIGHT];
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                panel[i][j] = CHESS_INT_NULL;
            }
        }
        this.status = STATUS_CONTINUABLE;
    }

    public int addChess(Chess chess) {
        if(status == STATUS_CONTINUABLE) {
            if (chess.getX() < 0 || chess.getX() >= WIDTH || chess.getY() < 0 || chess.getY() >= HEIGHT) {
                System.out.println("位置有误，该棋无效，请放棋子");
            }else if(panel[chess.getX()][chess.getY()] != CHESS_INT_NULL){
                System.out.println("该位置已有棋子，请重新放置");
            } else {
                panel[chess.getX()][chess.getY()] = chess.getColor();
                //设置棋子的顺序
                chessStack.push(chess);
                count ++;

                checkWin();
                if (status == STATUS_CONTINUABLE && ifFull()) {
                    status = STATUS_FULL;
                }

            }
        }else {
            System.out.println("暂时无法添加新棋子，请重试");
        }
        //返回棋子的状态
        return status;
    }

    public int getNextChessColor(){
        nextChessColor = count%2;
        return nextChessColor;
    }

    /**
     * 判断输赢状态
     * 没下完一个棋子后，对该棋子的八个方向遍历，判断胜负情况
     * @return STATUS_CONTINUABLE 暂无胜负，棋局继续
     *         STATUS_BLACK_WIN   黑棋胜利
     *         STATUS_WHITE_WIN   白棋胜利
     */
    private void checkWin(){
        Chess preChess = chessStack.peek();
        int x = preChess.getX();
        int y = preChess.getY();
        int count = 1;
        //右边获胜
        while (x+1 < WIDTH && panel[x+1][y] == preChess.getColor()){
            count ++;
            x ++;

        }
        if(count >= WIN_SIZE){
            winChess(preChess.getColor());
        }

        //左边获胜
        x = preChess.getX();
        y = preChess.getY();
        count = 1;
        while (x-1 >= 0 && panel[x-1][y] == preChess.getColor()){
            count ++;
            x --;
        }
        if(count >= WIN_SIZE){
            winChess(preChess.getColor());
        }

        //上边获胜.
        x = preChess.getX();
        y = preChess.getY();
        count = 1;
        while (y-1 >= 0 && panel[x][y-1] == preChess.getColor()){
            count ++;
            y --;
        }
        if(count >= WIN_SIZE){
            winChess(preChess.getColor());
        }

        //下边获胜
        x = preChess.getX();
        y = preChess.getY();
        count = 1;
        while (y+1 < HEIGHT && panel[x][y+1] == preChess.getColor()){
            count ++;
            y ++;
        }
        if(count >= WIN_SIZE){
            winChess(preChess.getColor());
        }

        //右上方获胜
        x = preChess.getX();
        y = preChess.getY();
        count = 1;
        while (y-1 >=0 && x+1 < WIDTH && panel[x+1][y-1] == preChess.getColor()){
            count ++;
            x ++;
            y --;
        }
        if(count >= WIN_SIZE){
            winChess(preChess.getColor());
        }

        //右下方获胜
        x = preChess.getX();
        y = preChess.getY();
        count = 1;
        while (y+1 < HEIGHT && x+1 < WIDTH && panel[x+1][y+1] == preChess.getColor()){
            count ++;
            x ++;
            y ++;
        }
        if(count >= WIN_SIZE){
            winChess(preChess.getColor());
        }

        //左上方获胜
        x = preChess.getX();
        y = preChess.getY();
        count = 1;
        while (y-1 >=0 && x-1 >=0  && panel[x-1][y-1] == preChess.getColor()){
            count ++;
            x --;
            y --;
        }
        if(count >= WIN_SIZE){
            winChess(preChess.getColor());
        }

        //左下方获胜
        x = preChess.getX();
        y = preChess.getY();
        count = 1;
        while (y+1 < HEIGHT && x-1 >= 0 && panel[x-1][y+1] == preChess.getColor()){
            count ++;
            x --;
            y ++;
        }
        if(count >= WIN_SIZE){
            winChess(preChess.getColor());
        }
    }

    /**
     * 根据传入的颜色来设置赢的情况
     * @param color
     */
    private void winChess(int color){
        if(color == CHESS_INT_BLACK)
            status = STATUS_BLACK_WIN;
        if (color==CHESS_INT_WHITE)
            status = STATUS_WHITE_WIN;
    }

    /**
     * 悔棋
     */
    public void retract(){
        if(chessStack.size() != 0){
            Chess preChess = chessStack.pop();
            panel[preChess.getX()][preChess.getY()] = CHESS_INT_NULL;
            count --;
        }else {
            System.out.println("无法继续悔棋");
        }

    }

    /**
     * 判断棋盘是否已经满了
     * @return true 棋盘已经满了
     *         false 棋盘还未满
     */
    private boolean ifFull() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (panel[j][i] == CHESS_INT_NULL) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 是否能继续下棋
     * @return
     */
    public boolean isContinuable(){
        return status == STATUS_CONTINUABLE;
    }

    /**
     * 打印棋盘
     */
    public void printPanel() {
        char tmp = ' ';

        //打印横坐标
        System.out.print(WORD_SPACE+WORD_SPACE);
        for (int j = 0; j < WIDTH; j++) {
            System.out.print(j%10+WORD_SPACE);
        }
        System.out.println();
        for (int i = 0; i < HEIGHT; i++) {
            //打印纵坐标
            System.out.print(i%10 + WORD_SPACE);
            for (int j = 0; j < WIDTH; j++) {

                switch (panel[j][i]) {
                    case CHESS_INT_NULL:
                        tmp = CHESS_NULL;
                        break;
                    case CHESS_INT_BLACK:
                        tmp = CHESS_BLACK;
                        break;
                    case CHESS_INT_WHITE:
                        tmp = CHESS_WHITE;
                        break;
                }
                System.out.print(tmp + WORD_SPACE);

            }
            System.out.println();
        }
    }

    /**
     * 打印下一个棋子的颜色
     */
    public void printNextChessColor(){
        if(isContinuable()){
            if(getNextChessColor() ==CHESS_NEXT_BLACK){
                System.out.println("下一步为黑棋，请输入黑棋坐标");
            }else {
                System.out.println("下一部步白棋，请输入白棋坐标");
            }
        }
    }

    /**
     * 游戏结束
     */
    public void end(){
        String message = "";
        switch (status){
            case STATUS_FULL:
                message = "棋盘已满，游戏结束";
                break;
            case STATUS_WHITE_WIN:
                message = "白棋获胜，恭喜！";
                break;
            case STATUS_BLACK_WIN :
                message = "黑棋获胜，恭喜！";
                break;

        }
        System.out.println(message);
    }

}
