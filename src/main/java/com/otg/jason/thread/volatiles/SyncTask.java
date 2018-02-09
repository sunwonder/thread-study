package com.otg.jason.thread.volatiles;

/**
 * ${DESCRIPTION}
 *  虽然running变量上没有volatile关键字修饰，但是读和写running都是同步方法

 同步块存在如下语义：
 1.进入同步块，访问共享变量会去读取主存
 2.退出同步块，本地内存对共享变量的修改会立即刷新到主存
 因此上述代码不会出现死循环。
 * @author jason.guan
 * @create 2018-02-09 上午11:15
 **/
public class SyncTask implements Runnable{
    boolean running = true;
    int i = 0;

    @Override
    public void run() {
        while (isRunning()) {
            i++;
        }
    }

    public synchronized boolean isRunning(){
        return running;
    }

    public synchronized void setRunning(boolean flag){
        running = flag;
    }


    public static void main(String[] args) throws InterruptedException {
        SyncTask task = new SyncTask();
        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(10);
        task.setRunning(false);
        System.out.println("running false, current i:" + task.i);
        Thread.sleep(3000);
        System.out.println(task.i);
        System.out.println("Stop");
    }
}
