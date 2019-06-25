package test;

import javax.jws.soap.SOAPBinding;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Test {

    public static void demo(String str) throws Exception {
        System.out.println("原文：" + str);
        printHex(str.getBytes("GBK"));
        byte[] utfByte = str.getBytes("UTF-8");
        System.out.print("utf Byte：");
        printHex(utfByte);
        String gbk = new String(utfByte, "GBK");//这里实际上把数据破坏了
        System.out.println("to GBK：" + gbk);

        byte[] gbkByte=gbk.getBytes("GBK");
        String utf = new String(gbkByte, "UTF-8");
        System.out.print("gbk Byte：");
        printHex(gbkByte);
        System.out.println("revert UTF8：" + utf);
        System.out.println("===");
        // 如果gbk变成iso-8859-1就没问题
    }

    public static void printHex(byte[] byteArray) {
        StringBuffer sb = new StringBuffer();
        for (byte b : byteArray) {
            sb.append(Integer.toHexString((b >> 4) & 0xF));
            sb.append(Integer.toHexString(b & 0xF));
            sb.append(" ");
        }
        System.out.println(sb.toString());
    };

    public static void main(String[] args) throws Exception {
        String str1 = "姓名";
        String str2 = "用户名";
        demo(str2);
        /*demo(str1,"UTF-8","ISO-8859-1");
        demo(str2,"UTF-8","ISO-8859-1");

        demo(str1,"UTF-8","GBK");
        demo(str2,"UTF-8","GBK");*/
    }
}