package com.otg.jason.thread.cake.single;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2018-02-08 下午3:25
 **/
public class Maker {
    private boolean free = true;
    private String name;

    public Maker(String name) {
        this.name = name;
    }

    public Cake makeCake(int size, String type) {
        Cake cake = null;
        free = false;
        try {
            if (size > 0 && size < 5) {
                Thread.sleep(3000);
            } else if (size < 10) {
                Thread.sleep(6000);
            } else if (size < 20) {
                Thread.sleep(10000);
            }
            System.out.println(size + "：寸" + type + "蛋糕制作完成");
            cake = new Cake(size, type);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        free = true;
        return cake;
    }

    public boolean isFree() {
        return free;
    }
}
