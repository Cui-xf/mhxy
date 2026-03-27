import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        byte[] payload = new byte[]{
                (byte) 0x81, (byte) 0x00, (byte) 0x1E, (byte) 0xE7, (byte) 0x99, (byte) 0xBB,
                (byte) 0xE9, (byte) 0x99, (byte) 0x86, (byte) 0xE5, (byte) 0xA4, (byte) 0xB1,
                (byte) 0xE8, (byte) 0xB4, (byte) 0xA5, (byte) 0xEF, (byte) 0xBC, (byte) 0x8C,
                (byte) 0xE8, (byte) 0xB4, (byte) 0xA6, (byte) 0xE5, (byte) 0x8F, (byte) 0xB7,
                (byte) 0xE4, (byte) 0xB8, (byte) 0x8D, (byte) 0xE5, (byte) 0xAD, (byte) 0x98,
                (byte) 0xE5, (byte) 0x9C, (byte) 0xA8
        };
        DataInputStream a = new DataInputStream(new ByteArrayInputStream(payload));
        byte b = a.readByte();
        System.out.println(b);
        String s = a.readUTF();
        System.out.println(s);
    }
}
