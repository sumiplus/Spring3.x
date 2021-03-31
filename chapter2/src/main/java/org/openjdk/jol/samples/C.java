package org.openjdk.jol.samples;

public class C {
    int i = 0;

    public synchronized void parse() {
        JOLExample08.countDownLatch.countDown();
        i++;
    }

}
