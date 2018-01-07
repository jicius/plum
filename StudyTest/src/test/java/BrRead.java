import java.io.*;


public class BrRead {
    public static void main(String[] args) throws IOException {
        char c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按 'q' 退出");
        do {
            c = (char) br.read();
            System.out.println(c);

        } while (c != 'q');
    }
}
