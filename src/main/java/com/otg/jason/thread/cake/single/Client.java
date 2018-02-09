package com.otg.jason.thread.cake.single;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2018-02-08 下午3:27
 **/
public class Client {
    public static void main(String[] args) {

        Customer a = new Customer("A");
        Customer b = new Customer("B");
        Customer c = new Customer("C");

        Shop shop = new Shop();

        long begin = System.currentTimeMillis();
        shop.receiveOrder(2,"奶油",a);
        long enda = System.currentTimeMillis();
        System.out.println("客户A等待时间："+(enda-begin));

        shop.receiveOrder(4,"奶油",b);
        long endb = System.currentTimeMillis();
        System.out.println("客户B等待时间："+(endb-begin));

        shop.receiveOrder(6,"奶油",c);
        long endc = System.currentTimeMillis();
        System.out.println("客户C等待时间："+(endc-begin));

    }
}
