package asimes.algorithm.basic;

import java.util.Scanner;

/**
 * Created by lianglab on 2016/3/31.
 * ���� ����дһ������ �������еõ���������������
 * max:ѡȡ����֮��������
 * areEq: �������Ƿ����
 * equal��
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] ints = new int[3];
        int count = 0;
        while (true) {
            try {
                ints[count++] = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return;
            }
            if (count >= 3) {
                break;
            }
            s = scanner.next();
        }
        System.out.println("The max number is " + max(ints));
        System.out.println("They are " + areEq(ints));
    }

    public static int max(int[] ints) {
        int max = ints[0];
        for (int j = 1; j < ints.length; j++) {
            if (max < ints[j])
                max = ints[j];

        }
        return max;
    }

    public static String areEq(int[] ints) {
        if (ints[0] == ints[1] && ints[1] == ints[2]) {
            return "equal";
        } else {
            return "not equal";
        }
    }

}
