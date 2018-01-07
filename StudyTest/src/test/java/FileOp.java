import java.io.*;

public class FileOp {
    public static void main(String[] args) throws IOException {
        File fileName = new File("/Users/jicius/Git/plum/StudyTest/src/test/java/BrRead.java");

        InputStream is = new FileInputStream(fileName);

        int size = is.available();

        for (int i=0; i<size; i++) {
            System.out.println((char) is.read());
        }
    }

}


