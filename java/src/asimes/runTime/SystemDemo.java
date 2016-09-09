package asimes.runTime;

/**
 * Created by Asimes on 2016/9/9.
 */
public class SystemDemo {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        int[] x = new int[10];
        final int[] y = x;
        y[5] =3;
        System.out.println(y[5]);
    }
}
