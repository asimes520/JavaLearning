package asimes.runTime;

import asimes.thread.consumerAndProducer.Run;

import java.io.IOException;

/**
 * Created by Asimes on 2016/9/9.
 */
public class RunTimeDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Process process = null;
        try {
            process = runtime.exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        process.destroy();
    }
}
