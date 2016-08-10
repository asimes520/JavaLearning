package asimes.algorithm.basic;

/**
 * Created by lianglab on 2016/3/31.
 * ���� ��
 */
public class PrintBlooeanArray {

    public static void main(String[] args) {
//        boolean arr[][] = {{false,true,false,false,true},{true,false,false,true,true},{true,true,true,true,true},{false,true,false,false,true},{false,true,false,false,true}};
//        print(arr);

        //test
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }

    public  static void print(boolean[][] arr){
        System.out.print(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            System.out.print(j);
            for (int k = 0; k < arr[j].length; k++) {
                System.out.print(arr[j][k] ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static int log(int N){

        return 0;
    }

}
