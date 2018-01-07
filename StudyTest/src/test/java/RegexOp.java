import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexOp {
    public static void main(String[] args) {
        String content = "I am noob" + " from runoobcom.";
        String pattern = "runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);

        System.out.println(isMatch);

        Pattern r = Pattern.compile(content);
        Matcher m = r.matcher(content);

        if (m.find()) {
            System.out.print(m.group(0));
        }

    }
}