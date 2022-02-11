package Common.BinaryReader;

import java.io.*;

public class BinaryReaderJ {


    private  File file;
    private  InputStream in;
    private  DataInputStream dStream;

    public BinaryReaderJ(File file){
        this.file = file;
        try {
            in = new FileInputStream(file);
            dStream = new DataInputStream(in);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public int Read(){
        int b = 0;
        try {
            b = dStream.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return b;
    }


    public  byte[] Read(int length){
        byte[] bs = new byte[length];
        byte[] rs = new byte[length];
        try {
            dStream.read(bs,0,length);
            System.arraycopy(bs, 0, rs, 0, length);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

    public  int ReadInt16(){
        byte[] bs = new byte[2];
        int temp = 0;
        try {
            dStream.read(bs,0,2);
            temp = HexUtil.byte2int(bs);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return temp;
    }

    /**
     * 讀取4byte 返回1個int
     * @author RKGG
     * @return 返回int
     * */
    public  int ReadInt32(){
        byte[] bs = new byte[4];
        int temp = 0;
        try {
            dStream.read(bs,0,4);
            temp = HexUtil.byteArrayToInt(bs, 0);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return temp;
    }


    public  int ToInt16(byte[] b,int start){
        byte[] bs = new byte[2];
        int temp = 0;
        System.arraycopy(b, start, bs, 0, 2);
        temp = HexUtil.byte2int(bs);
        return temp;
    }


    public  int ToInt32(byte[] b,int start){
        byte[] bs = new byte[4];
        int temp = 0;
        System.arraycopy(b, start, bs, 0, 4);
        temp = HexUtil.byteArrayToInt(bs, 0);
        return temp;
    }


    public  double ReadDouble(){
        byte[] bs = new byte[8];
        double b = 0;
        try {
            dStream.read(bs,0,8);
            b = HexUtil.byteArrayToDouble(bs, 0);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return b;
    }


    public  double ToDouble(byte[] b,int start){
        byte[] bs = new byte[8];
        System.arraycopy(b, start, bs, 0, 8);
        double d = HexUtil.byteArrayToDouble(bs, 0);
        return d;
    }

    public  double[] ReadDoubles(int length){
        byte[] bs = new byte[length*8];
        double[] d = new double[length];
        try {
            dStream.read(bs,0,bs.length);
            d = HexUtil.getData(bs, 0);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return d;
    }

    public  float ReadFloat(){
        byte[] bs = new byte[4];
        float f = 0;
        try {
            dStream.read(bs,0,4);
            f = HexUtil.byteArrayToFloat(bs, 0, 0);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return f;
    }


    public  float ToFloat(byte[] b,int start){
        byte[] bs = new byte[4];
        System.arraycopy(b, start, bs, 0, 4);
        float f = HexUtil.byteArrayToFloat(bs, 0, 0);
        return f;
    }

    /**
     * 讀取一個長度爲 length*4 的byte[]
     * 返回一個長度爲 length的float[]
     * @author RKGG
     * @param length
     * @return float[]
     * */
    public  float[] ReadFloats(int length){
        byte[] bs = new byte[length*4];
        float[] fs = new float[length];
        try {
            dStream.read(bs,0,bs.length);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String s = new String(bs);
        String[] ssr = s.split(",");
        for (int i = 0; i < fs.length; i++) {
            fs[i] = Float.parseFloat(ssr[i]);
        }
        return fs;
    }

    /**
     * 讀取1byte轉1char
     * @author RKGG
     * @return char
     * */
    public  char ReadChar(){
        byte[] bs = new byte[1];
        char ch = 0;
        try {
            dStream.read(bs,0,1);
            ch = HexUtil.byteArrayToChar(bs);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ch;
    }

    /**
     * 讀取長度爲length的byte[]
     * 返回長度爲length的char[]
     * @author RKGG
     * @param length
     * @return char[]
     * */
    public  char[] ReadChars(int length){
        byte[] bs = new byte[length];
        char[] ch = new char[length];
        try {
            dStream.read(bs,0,bs.length);
            ch = HexUtil.getChars(bs);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ch;
    }


    /**
     * 讀取一定長度 l的byte[]
     * 返回長度爲 l的String
     * @author RKGG
     * @param length
     * @return String
     * */
    public  String ReadString(int length){
        byte[] bs = new byte[length];
        String string = "";
        try {
            dStream.read(bs,0,bs.length);
            string = new String(bs);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return string;
    }


    /**
     * 讀取日期格式的double
     * 返回日期格式
     * @author RKGG
     * @param format
     * @return String
     * */
    public  String ReadDate(String format){
        byte[] bs = new byte[8];
        String time = "";
        double time_d = 0;
        try {
            dStream.read(bs,0,8);
            time_d = HexUtil.byteArrayToDouble(bs, 0);
            time = HexUtil.doubleToDate(time_d, format);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return time;
    }


    public  boolean ToBoolean(byte[] b,int start){
        byte[] bs = new byte[4];
        System.arraycopy(b, start, bs, 0, 4);
        boolean tmp = HexUtil.byteArrayToBoolean(bs, 0);
        return tmp;
    }

    /**
     * 關流
     * @author RKGG
     * */
    public  void close(){
        try {
            dStream.close();
            in.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

