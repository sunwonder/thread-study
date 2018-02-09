package com.otg.jason.thread.cake.single;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2018-02-08 下午3:25
 **/
public class Shop {
    static List<Maker> list;

    static {
        list = new ArrayList<Maker>();
        list.add(new Maker("张三"));
        list.add(new Maker("李四"));
    }

    public Cake receiveOrder(int size, String type, Customer customer) {
        Maker maker = getOne();
        Cake cake = maker.makeCake(size, type);
        System.out.println("客户：" + customer.getName() + "，蛋糕制作完成");
        return cake;
    }

    private Maker getOne() {
        Maker m = null;
        for (Maker maker : list) {
            if (maker.isFree()) {
                m = maker;
            }
        }
        return m;
    }
}
