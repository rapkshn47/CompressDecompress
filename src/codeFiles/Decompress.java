package codeFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class Decompress {
    public static void main(String[] args) throws IOException {
        File path = new File("E:\\NEVERGIVEUP...!!!\\Intellij\\CompressDecompress\\src\\codeFiles\\Compress.gz");
        decompress(path);
    }

    public static void decompress(File file) throws IOException {
        String fileDirectory = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzipIS = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory+"\\DecompressedFIle.txt");

        byte buffer[] = new byte[1024];
        int len;

        while((len = gzipIS.read(buffer)) != -1) fos.write(buffer, 0, len);

        gzipIS.close();
        fis.close();
        fos.close();
    }
}
