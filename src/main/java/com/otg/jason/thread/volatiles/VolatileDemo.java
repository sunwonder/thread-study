package com.otg.jason.thread.volatiles;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2018-02-09 上午11:23
 **/
public class VolatileDemo implements Runnable{

     volatile  int i = 0;
    @Override
    public void run() {
        for(int j= 0;j<10000;j++){
            i++;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        VolatileDemo demo1 = new VolatileDemo();
        VolatileDemo demo2 = new VolatileDemo();

        Thread thread1 = new Thread(demo1);
        Thread thread2 = new Thread(demo1);

        thread1.start();

        thread2.start();
        thread1.join();

        thread2.join();

        System.out.println(demo1.i);
        System.out.println(demo1.i);
    }
}
