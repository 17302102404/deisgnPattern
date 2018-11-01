package org.czx.singelonpattern.test;

import org.czx.singlonpattern.LazyPattern;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * 使用多线程测试懒汉式单例模式的性能问题和线程安全问题
 * 在这里补充一下多线程的问题，参考：
 * CountDownLatch 维护了一个计算器，当计算器不为0时，await()方法是阻塞的，使用countDown()方法一次计算器数值减1
 * 故一下在每个线程中先阻塞，然后同时执行建立对象，提高并发。
 *
 * Created by zhixuecai on 2018/10/29.
 */
public class LazyPatternTest {


//    /*
//         线程安全的测试
//     */
//    public static void main(String[] args) {
//        int count=200;
//        CountDownLatch countDownLatch = new CountDownLatch(count);
//
//        for(int i=0;i<count;i++){
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        countDownLatch.await();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    /*
//                       线程安全问题，会产生不同的对象
//                     */
//                    //System.out.println(System.currentTimeMillis()+":"+LazyPattern.getFirstInstance());
//                    /*
//                       无线程安全问题
//                     */
//                    //System.out.println(System.currentTimeMillis()+":"+LazyPattern.getSecondInstance());
//                    System.out.println(System.currentTimeMillis()+":"+LazyPattern.getThirdInstance());
//                }
//            }
//            ).start();
//            countDownLatch.countDown();
//        }


    /*
       一般电脑没法测出性能对比，线程设置太多可能导致电脑卡死
     */
    public static void main(String[] args) {

        int count=1000;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        CountDownLatch begin = new CountDownLatch(1);
        for(int i=0;i<count;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName());
                        begin.await();
                        //LazyPattern.getFirstInstance(); //2835
                        LazyPattern.getSecondInstance();//2826
                        //System.out.println(System.currentTimeMillis()+":"+LazyPattern.getThirdInstance());//3200
                        countDownLatch.countDown();//上述测试产生的原因是因为countDown是一个同步方法
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            ).start();

        }

        try {
            System.out.println("让线程都run起来等待，1秒后一起创建对象");
            Thread.sleep(1000);
            begin.countDown();
            System.out.println("start all run..............");
            long startTime = System.currentTimeMillis();
            countDownLatch.await();
            long  endTime = System.currentTimeMillis();
            System.out.println("总时长:"+(endTime-startTime));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
