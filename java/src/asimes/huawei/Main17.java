package asimes.huawei;


import java.util.Scanner;

/**
 * Created by lianglab on 2016/9/1.
 * 功能 ：将16进制字符串转为10进制数 使用Integer中的valueOf(str,digit)方法
 */
public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        str=str.substring(2).toUpperCase();
        long i = Long.valueOf(str,16);
        System.out.println(i);
        System.out.println(hexToDec(str,16));
    }

    public static long hexToDec(String str,int radix){
        long dex = 0;
        int len = str.length();
        char c ;
        int power =0;
        for (int i = len-1; i >=0 ; i--) {
            c = str.charAt(i);
            //如果是26个英语字母,'A'-'Z' 对应的是65-90
            if(c>=65 && c<=90){
                //减55是因为ASCII中，'A'对应的是65，而A对应的十进制数是10，或者可以写作 c>='A'&&c<='Z'
                dex += (c-55)*Math.pow(radix,power++);
            }else if(c>=48 && c<=57){ //如果是数字，'0'-'9'对应的码表是 48-57,c>='0'&&c<='1'
                dex += Integer.valueOf(c+"")*Math.pow(radix,power++);
            }else {
                throw new NumberFormatException();
            }
//            switch (c){
//                case 'F':
//                    dex += 15*Math.pow(radix,power++);
//                    break;
//                case 'E':
//                    dex += 14*Math.pow(radix,power++);
//                    break;
//                case 'D':
//                    dex += 13*Math.pow(radix,power++);
//                    break;
//                case 'C':
//                    dex += 12*Math.pow(radix,power++);
//                    break;
//                case 'B':
//                    dex += 11*Math.pow(radix,power++);
//                    break;
//                case 'A':
//                    dex += 10*Math.pow(radix,power++);
//                    break;
//                default:
//                    dex += Integer.valueOf(c+"")*Math.pow(radix,power++);
//            }
        }
        return dex;
    }

}
