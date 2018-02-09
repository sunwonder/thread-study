package com.otg.jason.thread.volatiles;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2018-02-09 上午10:55
 **/
public class Task implements Runnable {
    //    volatile boolean running = true;
    boolean running = true;
    int i = 0;

    @Override
    public void run() {
        while (running) {
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(10);
        //main线程也是独立的线程，这样初学者才能比较清楚理解为什么在main线程修改变量后，在th线程不可见
        task.running = false;
        System.out.println("running false, current i:" + task.i);
        Thread.sleep(3000);
        System.out.println(task.i);
        System.out.println("Stop");
    }


}
