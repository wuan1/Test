package java03_09;
//使用数组来实现循环队列的一系列操作
public class MyQueue2<head> {
    private int[] data = new int[100];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    //入队列
    public boolean offer(int val) {
        if (size == data.length) {
            //这时队列已满
            return false;
        }
        //把新元素放到tail对应的下标上
        data[tail] = val;
        tail++;
        //一旦tail到达了数组的末尾，这时就应让tail从0开始
        if (tail == data.length) {
            tail = 0;
        }
        size++;
        return true;
    }


        //出队列
        public Integer poll() {
            if (size == 0) {
                return null;
            }
            int ret = data[head];
            head++;
            if (head == data.length) {
                head = 0;
            }
            size--;
            return ret;
        }

        //取队首元素
    public Integer peek() {
        if (head == 0) {
            return null;
        }
        return data[head];
    }
}
