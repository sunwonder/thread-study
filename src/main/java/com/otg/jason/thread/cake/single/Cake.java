package com.otg.jason.thread.cake.single;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2018-02-08 下午3:26
 **/
public class Cake {
    private int size;
    private String type;

    public Cake(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
