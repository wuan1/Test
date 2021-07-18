package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testStream {
    public static  void main(String[] args) throws IOException {
        //写文件
//        FileOutputStream fileOutputStream =
//                new FileOutputStream("e:/test.txt");
//        String s = "hello";
//        fileOutputStream.write(s.getBytes());
//        fileOutputStream.close();

        //读文件
        FileInputStream fileInputStream =
                new FileInputStream("e:/test.txt");
        while(true){
            int c = fileInputStream.read();
            if(c == -1){
                // c 其实就是读取到的这个字节
                //如果要是读取文件完毕了，c 就返回 -1
                break;
            }
            System.out.print((byte)c);

        }
        fileInputStream.close();


    }
}
