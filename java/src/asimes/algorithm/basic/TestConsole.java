package asimes.algorithm.basic;

import java.io.Console;
import java.math.BigInteger;

/**
 * Created by lianglab on 2016/6/23.
 * 功能 ：
 */
public class TestConsole {
    public static void main(String[] args) {
        Console console = System.console();
        String username = console.readLine("User name:");
        char[] ped = console.readPassword("Password: ");
        System.out.println(username);
    }
}
