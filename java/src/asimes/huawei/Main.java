package asimes.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lianglab on 2016/8/11.
 * 功能 ：
 */
public class Main {
    //字符串最后一个数组的长度
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        if(str.length()<=128){
//            String[] strings = str.split(" ");
//            System.out.println(strings[strings.length-1].length());
//
//        }else {
//            System.exit(0);
//        }
//
//    }

    //计算名字的漂亮度
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        Integer N = scanner.nextInt();
        String[] names = new String[N];
        for (int j = 0; j < N; j++) {
            names[j] = scanner.next();
        }

        int beauty;
        for (int j = 0; j < names.length; j++) {
            beauty = main.calBeauty(names[j]);
            System.out.print(beauty + "\t");
        }

    }

    public  int calBeauty(String name) {
        name = name.toLowerCase();
        int[] tmp = new int[26];

        int index;
        for (int i = 0; i < name.length(); i++) {
            index = name.charAt(i) - 97;
            tmp[index]++;
        }
        Arrays.sort(tmp);
        int i = 25;
        int beauty = 0;
        while(tmp[i] > 0){
            beauty += tmp[i]*(i+1);
            i--;
        }
        return beauty;

    }
}
