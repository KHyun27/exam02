package pack1;

import java.io.*;

public class TextIO {

    public static void write(String fileName, String text) {
        File file = new File(fileName);
        try (FileWriter fWriter = new FileWriter(file)) {
            fWriter.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static StringBuilder read(String fileName) {
        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();

        try (FileReader fReader = new FileReader(file)) {
            char[] buffer = new char[128];
            int readBytes;
            while ((readBytes = fReader.read(buffer)) != -1) {
                String str = new String(buffer,0,readBytes);
                sb.append(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb;
    }
}
