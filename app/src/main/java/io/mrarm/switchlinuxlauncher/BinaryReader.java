package io.mrarm.switchlinuxlauncher;

public class BinaryReader {

    public static int readInt32(byte[] buf, int off) {
        return ((buf[off] & 0xff) |
                ((buf[off + 1] & 0xff) << 8) |
                ((buf[off + 2] & 0xff) << 16) |
                ((buf[off + 3] & 0xff) << 24));
    }

}
