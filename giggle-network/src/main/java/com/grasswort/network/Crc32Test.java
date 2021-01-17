package com.grasswort.network;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

/**
 * @author xuliangliang
 * @Description
 * @Date 2021/1/6
 */
public class Crc32Test {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(hash("树林里面丢了鞋"));
        }
    }

    private static final long hash(String key) {
        InputStream is = new ByteArrayInputStream(key.getBytes());
        CRC32 crc32 = new CRC32();
        CheckedInputStream checkedInputStream = new CheckedInputStream(is, crc32);
        try {
            while (checkedInputStream.read() != -1) {};
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                checkedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return crc32.getValue();
    }
}
