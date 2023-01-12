import java.io.*;
public class FileOutputStreamIntroduction {
  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("output.txt");
    String outputText = "Here is some string output!";
    byte[] byteText = outputText.getBytes();
    out.write(byteText);

    out.close();
  }
}