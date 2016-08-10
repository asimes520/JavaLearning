package asimes.thread.safe;

/**
 * Created by lianglab on 2016/7/28.
 * 功能 ：
 */
public class LoginServlet {
    private static String userName;
    private static String passWord;
    synchronized  public static void doPost(String name,String pwd){
        try{
            userName = name;
            if(userName.equals("a")){
                Thread.sleep(3000);
            }
            passWord = pwd;
            System.out.println("Name : " + userName + " Password : " + passWord);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
