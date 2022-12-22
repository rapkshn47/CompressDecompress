package codeFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Compress {
    public static void main(String[] args) throws IOException {
        File path = new File("E:\\NEVERGIVEUP...!!!\\Intellij\\CompressDecompress\\src\\codeFiles\\test.txt");
        compress(path);
    }

    public static void compress(File file) throws IOException {
        String fileDirectory = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(fileDirectory+"\\Compress.gz");
        GZIPOutputStream gzipOS = new GZIPOutputStream(fos);

        byte buffer[] = new byte[1024];
        int len;

        while((len = fis.read(buffer)) != -1) gzipOS.write(buffer,0,len);

        gzipOS.close();
        fos.close();
        fis.close();
    }
}
