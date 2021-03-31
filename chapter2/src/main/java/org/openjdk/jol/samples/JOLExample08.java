package org.openjdk.jol.samples;

import java.util.concurrent.CountDownLatch;

public class JOLExample08 {

    static CountDownLatch countDownLatch = new CountDownLatch(1000000000);

    public static void main(String[] args) throws InterruptedException {
        C c = new C();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(() -> {
                while (countDownLatch.getCount() > 0) {
                    c.parse();
                }
            });
            t.start();
        }
        countDownLatch.await();
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
