package com.basic.jmm.volatiletest;

/**
 * Created by LSH on 2018/11/18.
 *
 * @author LSH
 * @date 2018/11/18
 */
public class VolatileAndMain {
    public static boolean stop = true;
    static int a = 0;

    /**
     * 测试主线程，和 子线程 变量是否可见，一直不可见？还是 延时可见
     * todo 何时会主动刷新内存
     * <p>
     * 1.使用volatile
     * 2.synchronized
     */
    public static void main(String[] args) throws Exception {

        new Thread(() -> {
            while (stop) {
                synchronized (VolatileAndMain.class) {
                    a++;
                }
            }
            System.out.println("a = " + a);
        }).start();


        Thread.sleep(2000);
        stop = false;
        System.out.println("end");
    }
}
