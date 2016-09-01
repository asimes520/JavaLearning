package asimes.chess;

/**
 * Created by lianglab on 2016/8/31.
 * 功能 ：
 */
public class Chess {

    private static final int COLOR_BLACK = 0;
    private static final int COLOR_WHITE = 1;


    private int x;
    private int y;

    private int color  = -1;


    public int getColor() {
        return color;
    }



    public void setColor(int color) {
        this.color = color;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public Chess() {
        x = 0;
        y = 0;
        color = COLOR_BLACK;
    }


    public Chess(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chess{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }
}
