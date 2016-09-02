package asimes.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lianglab on 2016/9/1.
 * 功能 ：一堆硬币，一个机器人，如果是反的就翻正，如果是正的就抛掷一次，无穷多次后，求正反的比例。
 */
public class Main7 {
    public static void main(String[] args) {
        Main7 main = new Main7();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int size = scanner.nextInt();
            int times = scanner.nextInt();
            int[] intArr = new int[2*size];
            for (int j = 0; j < 2*size; j++) {
                intArr[j] = scanner.nextInt();
            }
            for (int j = 0; j < times; j++) {
                main.getCards(size,intArr);
            }
            for (int j = 0; j < intArr.length-1; j++) {
                System.out.print(intArr[j]+ " ");
            }
            System.out.print(intArr[intArr.length-1]);
            System.out.println();
        }
    }

    public void getCards(int size,int[] cards){
        int[] tmp = new int[cards.length];
        for (int i = 0; i < size; i++) {
            tmp[2*i] = cards[i];
            tmp[2*i+1] = cards[i+size];
        }
        for (int i = 0; i < tmp.length; i++) {
            cards[i] = tmp[i];
        }
    }
}
