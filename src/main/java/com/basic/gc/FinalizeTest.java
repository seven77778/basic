package com.basic.gc;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

/**
 * Created by lsh on 2018/11/23 20:43
 *
 * 显示调用 finalize()
 *
 * -XX:+PrintGCDetails -Xmx50m -Xms50m -XX:MetaspaceSize=50m -XX:+UseParallelGC
 *
 * Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
 * After creating 1100000 objects, 802425 are still alive.
 *
 * 为什么会出现溢出？因为Finalizer线程和主线程相比它的优先级要低。这意味着分配给它的CPU时间更少，因此它的处理速度没法赶上新对象创建的速度。
 * 这就是问题的根源——对象创建的速度要比Finalizer线程调用finalize()结束它们的速度要快，这导致最后堆中所有可用的空间都被耗尽了，结果就是OOM
 *
 * Finalizer线程是个单一职责的线程。这个线程会不停的循环等待java.lang.ref.Finalizer.ReferenceQueue中的新增对象。一旦Finalizer线程发现队列中出现了新的对象，它会弹出该对象，调用它的finalize()方法，
 * 将该引用从Finalizer类中移除，因此下次GC再执行的时候，这个Finalizer实例以及它引用的那个对象就可以回垃圾回收掉了
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * 更换cms之后：-XX:+PrintGCDetails -Xmx20m -Xms20m -Xmn10m -XX:MetaspaceSize=20m -XX:+UseConcMarkSweepGC
 * After creating 29000000 objects, 314106 are still alive.
 * 异常也不同：java.lang.OutOfMemoryError: Java heap space
 */
public class FinalizeTest {

    static AtomicInteger aliveCount = new AtomicInteger(0);

    @Override
    protected void finalize() throws Throwable {
        FinalizeTest.aliveCount.decrementAndGet();
    }

    public FinalizeTest() {
        aliveCount.incrementAndGet();
    }

    public static void main(String args[]) {
        for (int i = 0;; i++) {
            FinalizeTest f = new FinalizeTest();
            if ((i % 100_000) == 0) {
                System.out.format("After creating %d objects, %d are still alive.%n", new Object[] {i, FinalizeTest.aliveCount.get() });
            }
        }
    }

    /**
     * -XX:+PrintCommandLineFlags
     */
    @Test
    public void test(){

    }
}
