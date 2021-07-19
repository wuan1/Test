package waiguan;
//客户端测试类
public class Client {
    public static  void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("E:/Users/17384/Desktop/facade/src.txt","E:/Users/17384/Desktop/facade/des.txt");
    }
}
