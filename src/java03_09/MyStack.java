package java03_09;
//使用顺序表实现栈的一系列操作
public class MyStack {
    private int[] data = new int[100];
    private int size = 0;


//使用尾插来表示入栈
public void push(int val) {
    if(size >= data.length) {
        return;
    }
    data[size] = val;
    size++;
  }
  //尾删表示出栈
  public Integer pop(){
    if(size == 0) {
        return null;
    }
    int ret = data[size - 1];
    size--;
    return ret;
 }
 //取栈顶元素
 public Integer peek() {
    if(size == 0) {
        return null;
    }
     return data[size - 1];
 }
}
