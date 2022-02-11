package Common.BinaryReader;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HexUtil {

    /**
     * 4byte 轉 int
     * */
    public static int byteArrayToInt(byte[] b, int start) {
        int value = 0;
        byte[] temp = null;
        temp = new byte[4];
        System.arraycopy(b, start, temp, 0, 4);
        value = byte2int(temp);
        return value;
    }

    public static int byteToInt(byte[] b, int offset) {
        int value = 0;
        for (int i = 0; i < 4; i++) {
            int shift = (4 - 1 - i) * 8;
            value += (b[i + offset] & 0x000000FF) << shift;
        }
        return value;
    }

    /**
     * 2byte 轉int
     * */
    public static int byte2int(byte[] res) {
        int targets = (res[0] & 0xff) | ((res[1] << 8) & 0xff00);
        return targets;
    }

    /**
     * byte[] 轉 boolean
     * */
    public static boolean byteArrayToBoolean(byte[] data, int start) {
        if (data == null || data.length < 4) {
            return false;
        }
        byte[] bytes = new byte[4];
        System.arraycopy(data, start, bytes, 0, 4);
        int tmp = byteArrayToInt(bytes, 0);
        return (tmp == 0) ? false : true;
    }

    /**
     * get double[]
     * */
    public static double[] getData(byte[] bs, int start) {
        byte[] data;
        double[] yData = new double[bs.length / 8];
        int counts = 0;
        for (int i = start; i < bs.length - 1;) {
            data = new byte[8];
            System.arraycopy(bs, i, data, 0, 8);
            yData[counts] = byteArrayToDouble(data, 0);
            i += 8;
            counts++;
        }
        return yData;
    }

    public static double byteArrayToDouble(byte[] b, int start) {
        long l;
        byte[] bytes = new byte[8];
        System.arraycopy(b, start, bytes, 0, 8);
        l = bytes[0];
        l &= 0xff;
        l |= ((long) bytes[1] << 8);
        l &= 0xffff;
        l |= ((long) bytes[2] << 16);
        l &= 0xffffff;
        l |= ((long) bytes[3] << 24);
        l &= 0xffffffffl;
        l |= ((long) bytes[4] << 32);
        l &= 0xffffffffffl;
        l |= ((long) bytes[5] << 40);
        l &= 0xffffffffffffl;
        l |= ((long) bytes[6] << 48);
        l &= 0xffffffffffffffl;
        l |= ((long) bytes[7] << 56);
        return Double.longBitsToDouble(l);
    }

    public static String byteTostring(byte[] bs) {
        String s = "";
        try {
            s = new String(bs,"GB2312");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return s;
    }


    public static float byteArrayToFloat(byte[] b, int index, int start) {
        int l;
        byte[] data = new byte[4];
        System.arraycopy(b, start, data, 0, 4);
        l = data[index + 0];
        l &= 0xff;
        l |= ((long) data[index + 1] << 8);
        l &= 0xffff;
        l |= ((long) data[index + 2] << 16);
        l &= 0xffffff;
        l |= ((long) data[index + 3] << 24);
        return Float.intBitsToFloat(l);
    }

    public static char[] getChar(byte[] bytes, int start) {
        byte[] data;
        char[] data_char = new char[bytes.length / 2];
        int counts = 0;
        for (int i = start; i < bytes.length - 1;) {
            data = new byte[2];
            System.arraycopy(bytes, i, data, 0, 2);
            data_char[counts] = byteArrayToChar(data);
            i += 2;
            counts++;
        }
        return data_char;
    }

    public static char byteArrayToChar(byte[] b) {
        char c = (char) (((b[0] & 0xFF) << 8) | (b[1] & 0xFF));
        return c;
    }

    public static char[] getChars(byte[] bytes) {
        Charset cs = Charset.forName("UTF-8");
        ByteBuffer bb = ByteBuffer.allocate(bytes.length);
        bb.put(bytes);
        bb.flip();
        CharBuffer cb = cs.decode(bb);

        return cb.array();
    }

    /**
     * double 轉 date
     * */
    public static String doubleToDate(Double d,String format) {
        String t;
        Calendar base = Calendar.getInstance();
        SimpleDateFormat outFormat = new SimpleDateFormat(format);
        // Delphi的日期類型從1899-12-30開始
        base.set(1899, 11, 30, 0, 0, 0);
        base.add(Calendar.DATE, d.intValue());
        base.add(Calendar.MILLISECOND, (int) ((d % 1) * 24 * 60 * 60 * 1000));
        t = outFormat.format(base.getTime());
        return t;
    }
}
