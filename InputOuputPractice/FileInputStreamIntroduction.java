import java.io.*;

public class FileInputStreamIntroduction {
  public static void main(String[] args) throws IOException {
    String path = "./input.txt";
    FileInputStream in = new FileInputStream(path);

    int counter = 0;
    while ((counter = in.read()) != -1) {
      System.out.print((char)counter);
    }
    in.close();
  }
}