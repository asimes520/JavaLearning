package asimes.algorithm.basic;

/**
 * Created by lianglab on 2016/3/31.
 * ���� ��
 */
public class IntegerToBinaryString{
    public static void main(String[] args) {
        simpleSolution(5);
        ownSolution(5);
    }

    public static void simpleSolution(int arg){
        System.out.println(Integer.toBinaryString(arg));
    }

    public static void ownSolution(int arg){
        String s = "";
        for (int i = arg; i > 0; i/=2) {
            s = (i%2) +s;
        }
        System.out.println(s);
    }
}
