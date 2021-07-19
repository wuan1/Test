package java_03_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MySort {
    //插入排序

    public static void insertSort(int[] arr) {

        // 这个循环就是在控制代码进行 N 次插入过程
        for (int bound = 1; bound < arr.length; bound++) {
            //此处的循环是用来表示未排序区间
            //已排序区间[0,bound)
            //未排序区间[bound,length)
            //此处的v就是待排序区间的第一个元素，也就是要插入的元素
            int v = arr[bound];
            int cur = bound - 1;
            for (; cur >= 0; cur--) {
                if (arr[cur] > v) {
                    arr[cur + 1] = arr[cur];
                } else {
                    //此时就说明找到了v要插入的位置
                    break;
                }
            }
            arr[cur + 1] = v;
        }

    }

    //希尔排序
    public static void shellSort(int[] arr) {
        //指定gap序列
        int gap = arr.length / 2;
        while (gap >= 1) {
            _shellSort(arr, gap);
            gap = gap / 2;
        }
    }

    public static void _shellSort(int[] arr, int gap) {
        int bound = gap;
        for (; bound < arr.length; bound++) {
            //待插入元素
            int v = arr[bound];
            //当前将要比较元素的下标
            int cur = bound - gap;
            for (; cur >= 0; cur -= gap) {
                if (arr[cur] > v) {
                    arr[cur + gap] = arr[cur];
                } else {
                    break;
                }
            }
            arr[cur + gap] = v;
        }
    }


    //选择排序

    public static void selectSort(int[] arr) {
        // 设置一个bound值，表示已排序区间与未排序区间的边界值
        //[0,bound) 已排序区间
        //[bound,length) 未排序区间
        int bound = 0;
        for (; bound < arr.length; bound++) {
            //里层循环表示要进行打擂台的过程
            int cur = bound + 1;
            for (; cur < arr.length; cur++) {
                if (arr[bound] > arr[cur]) {
                    swap(arr, bound, cur);
                }
            }
        }
    }


    //堆排序

    public static void heapSort(int[] arr) {
        //1.创建堆
        createHeap(arr);
        //2.循环进行堆顶元素与数组最后一个元素进行交换，并删除最后一个元素
        int heapSize = arr.length;//数组的大小
        for (int i = 0; i < arr.length; i++) {
            swap(arr, 0, heapSize - 1);
            //删除最后一个元素
            heapSize--;
            shiftDown(arr, heapSize, 0);
        }
    }

    public static void shiftDown(int[] arr, int size, int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while (child < size) {
            if (child + 1 < size && arr[child + 1] > arr[child]) {
                child = child + 1;
            }
            if (arr[parent] < arr[child]) {
                swap(arr, parent, child);
            } else {
                break;
            }

            //重新调整parent与child的值
            parent = child;
            child = 2 * parent + 1;
        }
    }


    public static void createHeap(int[] arr) {
        //从后往前遍历,i=arr.length-1-1,表示数组的最后一个元素（左子树）
        for (int i = (arr.length - 1 - 1) / 2; i >= 0; i--) {
            shiftDown(arr, arr.length, i);
        }
    }


    //冒泡排序
    public static void bubbleSort(int[] arr) {
        //从后往前遍历
        int bound = 0;
        //控制多少轮
        for (; bound < arr.length; bound++) {
            int cur = arr.length - 1;
            //控制每轮的次数
            for (; cur > bound; cur--) {
                if (arr[cur - 1] > arr[cur]) {
                    swap(arr, cur - 1, cur);
                }
            }
        }
    }


    //快速排序(递归）

    public static void quickSort(int[] arr) {
        //使用一个辅助方法进行递归
        //这时辅助方法里多了两个参数，用来表示对数组的哪个区间进行整理
        _quickSort(arr, 0, arr.length - 1);
    }

    public static void _quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            //区间里没有或只有一个元素，不必排序
            return;
        }
        //index表示left和right的重合位置
        int index = partition(arr, left, right);
        //递归处理左半区间
        _quickSort(arr, left, index - 1);
        //递归处理右半区间
        _quickSort(arr, index + 1, right);

    }

    public static int partition(int[] arr, int left, int right) {
        //选取基准值
        int v = arr[right];
        int i = left;
        int j = right;
        while (i < j) {
            //先从左往右找一个比基准值大的元素
            while (i < j && arr[i] <= v) {
                i++;
            }
            //从右往左找出一个比基准值小的元素
            while (i < j && arr[j] >= v) {
                j--;
            }
            swap(arr, i, j);
        }
        //当i j 重合的时候，就将当前元素与基准值位置交换
        swap(arr, i, right);
        return i;

    }


    //快速排序(非递归)


    public static void quickSortByLoop(int[] arr) {
        //建立一个栈,栈里面存放要去处理的空间
        Stack<Integer> stack = new Stack<>();
        //把第一组要去处理的区间入栈
        stack.push(0);
        stack.push(arr.length - 1);
        //循环取栈顶元素的区间，进行partition操作
        while (!stack.isEmpty()) {
            int end = stack.pop();
            int beg = stack.pop();
            if (beg >= end) {
                //区间只有一个或没有元素，不需排序
                return;
            }
            //调用partition方法
            int index = partition(arr, beg, end);
            //把得到的子区间再入栈

            stack.push(index + 1);
            stack.push(end);

            stack.push(beg);
            stack.push(index - 1);

        }
    }



    //归并排序
    public static void mergeSort(int[] arr){
        //使用一个方法来辅助递归，多出的两个参数表示是从哪个区间进行排序的
        //区间为前闭后开区间
        _mergrSort(arr,0,arr.length);
    }

    public static void _mergrSort(int[] arr,int left,int right){
        if(right - left <= 1) {
            //表示这个区间的元素为1个或者没有元素，直接返回，无需排序
            return;
        }
        //把区间一分为二
        //[left,mid)和[mid,left)两个区间
        int mid = (left + right) / 2;
        //当左半边区间通过_mergeSort递归完成，表示该区间已经是一个有序区间了
        _mergrSort(arr,left,mid);
        //当左半边区间通过_mergeSort递归完成，表示该区间已经是一个有序区间了
        _mergrSort(arr,mid,right);
        //接下来就将两个有序数组进行合并
        merge(arr,left,mid,right);
    }

    public static void merge(int[] arr,int left,int mid,int right) {
        if (left >= right) {
            return;
        }
        //创建一个临时数组，用来存放新合成的数组
        //我们需要在临时数组中存放right-left个元素
        int[] tmp = new int[right - left];
        //要把新的元素放入临时数组的下标中
        int tmpsize = 0;
        //l和r分别表示两个数组最开始的位置
        int l = left;
        int r = mid;
        while (l < mid && r < right) {
            //归并排序是一个稳定排序，所以条件不能是arr[l]<arr[r]
            if (arr[l] <= arr[r]) {
                tmp[tmpsize] = arr[l];
                tmpsize++;
                l++;
            } else {
                tmp[tmpsize] = arr[r];
                tmpsize++;
                r++;
            }
        }
        //其中一个数组已经遍历完成，这时就把另一个数组依次插入临时数组中
        while (l < mid) {
            tmp[tmpsize] = arr[l];
            tmpsize++;
            l++;
        }
        while (r < right) {
            tmp[tmpsize] = arr[r];
            tmpsize++;
            r++;
        }
        //这时数组全部放入临时数组中，需要把临时数组中的元素全部拷贝回原数组arr[]
        //+left的原因是[left,right)这个区间不一定是从0开始的
        for(int i = 0; i < tmp.length; i++){
                arr[left + i] = tmp[i];
            }
    }

    //归并排序  非递归
    public static void mergeSortByLoop(int[] arr){
        //gap为当前待合并的有序数组的长度
        for(int gap = 1; gap < arr.length; gap *= 2) {
            //外层循环
            //第一次是把数组长度为1的两个有序数组两两合并
            //第二次是把数组长度为2的两个有序数组两两合并
            //第三次是把数组长度为4的两个有序数组两两合并
            for (int i = 0; i < arr.length; i += 2 * gap) {
                int left = i;
                int mid = i + gap;
                if (mid > arr.length) {
                    mid = arr.length;
                }
                int right = i + 2 * gap;
                if (right > arr.length) {
                    right = arr.length;
                }
                merge(arr, left, mid, right);
            }
        }
    }




    public static void swap(int[] arr,int x,int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {6,4,9,2,0,1,8,5};
       // insertSort(arr);
        //shellSort(arr);
       // selectSort(arr);
        //heapSort(arr);
       // bubbleSort(arr);
        //quickSort(arr);
        //quickSortByLoop(arr);
        //mergeSort(arr);
        mergeSortByLoop(arr);
        System.out.println(Arrays.toString(arr));
    }

}
