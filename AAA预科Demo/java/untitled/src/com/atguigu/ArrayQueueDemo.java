package com.atguigu;

import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrQueue arr = new ArrQueue(3);
        char key = ' ';
        Scanner sc = new Scanner(System.in);
        boolean loop =true;
        while (loop){
            System.out.println("s(show):显示队列");
            System.out.println("a(show):添加队列");
            System.out.println("e(exit):退出程序");
            System.out.println("g(add):添加数据到队列");
            System.out.println("h(get):查看队列头的数据");
            key = sc.next().charAt(0);
            switch (key){
                case 's':
                    arr.showQueue();
                    break;
                case 'a':
                    System.out.print("请输入一个数:");
                    int val = sc.nextInt();
                    arr.addQueue(val);
                    break;
                case 'g':
                    try {
                        int res = arr.getQueue();
                        System.out.println("取出的数据是:"+res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try{
                        int res = arr.headQueue();
                        System.out.println("队列头的数据是:"+res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    sc.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序已退出");
    }
}
//  使用数组模拟队列
class ArrQueue{
    private int maxSize;  //表示数组最大容量
    private int front;  //序列头
    private int rear;    //序列尾
    private  int arr[];


//    创建队列的构造器
    public ArrQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;

    }
//    判断队列是否满
    public boolean isFull(){
        return rear == maxSize -1;
    }
//    判断队列是否为空
    public boolean isEmpty(){
        return rear == front;
    }
//    添加数组到队列
    public void addQueue(int n){
//        判断队列是否满
        if (isFull()){
            System.out.println("队列已满");
            return;
        }
        rear++;
        arr[rear] = n;
    }
//    获取队列数据取数据
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列空，不能取数据");
        }
        front++;
        return arr[front];
    }
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列为空，不能打印");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("aee[%d]=%d\n",i,arr[i]);
        }
    }

//    显示队列的头数据
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列空的，没有数据~~");
        }
        return arr[front + 1];
    }


}
