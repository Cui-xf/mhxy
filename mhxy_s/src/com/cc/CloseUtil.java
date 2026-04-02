package com.cc;

import java.io.*;

public class CloseUtil {
    public static void close(InputStream bis, DataInputStream dis) {
        if (bis != null) {
            try {
                bis.close();
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        if (dis != null) {
            try {
                dis.close();
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }

    public static void close(ByteArrayOutputStream bos, DataOutputStream dos) {
        if (bos != null) {
            try {
                bos.close();
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        if (dos != null) {
            try {
                dos.close();
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }
}
