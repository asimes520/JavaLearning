package asimes.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lianglab on 2016/9/6.
 * 功能 ：
 */
public class StringUtil {
    public static String judgeChineseCharacter(String str) {
        String regEx = "[\u4e00-\u9fa5]";
        if (str.getBytes().length == str.length()) {
            return "";
        } else {
            Pattern p = Pattern.compile(regEx);
            Matcher matcher = p.matcher(str);
            StringBuffer sb = new StringBuffer();
            while (matcher.find()) {
                sb.append(matcher.group(0));
            }
            return sb.toString();
        }

    }
}
