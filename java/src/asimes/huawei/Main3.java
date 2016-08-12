package asimes.huawei;

import java.util.Scanner;

/**
 * Created by lianglab on 2016/8/11.
 * 功能 ：
 */
public class Main3 {
    public void Encrypt(char aucPassword[]) {
        char[] result = new char[aucPassword.length];
        char c;
        for (int i = 0; i < aucPassword.length; i++) {
            c = aucPassword[i];
            if (c >= 65 && c <= 90) {
                if (c == 'Z') {
                    result[i] = 'a';
                } else
                    result[i] = (char) ((c + 33));
            } else if (c >= 97 && c <= 122) {
                if (c == 'z') {
                    result[i] = 'A';
                } else
                    result[i] = (char) ((c - 31));
            } else if (c >= 48 && c <= 57) {
                if (c == '9') {
                    result[i] = '0';
                } else
                    result[i] = (char) ((int) c + 1);
            }
        }
        System.out.println(new String(result));
    }

    public void unEncrypt(char result[]) {
        char[] password = new char[result.length];
        char c;
        for (int i = 0; i < result.length; i++) {
            c = result[i];
            if (c >= 97 && c <= 122) {
                if (c == 'a') {
                    password[i] = 'Z';
                } else
                    password[i] = (char) ((c - 33));
            } else if (c >= 65 && c <= 90) {
                if (c == 'A') {
                    password[i] = 'z';
                } else
                    password[i] = (char) ((c + 31));
            } else if (c >= 48 && c <= 57) {
                if (c == '0') {
                    password[i] = '9';
                } else
                    password[i] = (char) ((int) c - 1);
            }
        }
        System.out.println(new String(password));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        Main3 main = new Main3();
        main.Encrypt(str1.toCharArray());
        main.unEncrypt(str2.toCharArray());
    }
}
