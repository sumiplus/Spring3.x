package org.openjdk.jol.samples;

import org.openjdk.jol.info.ClassLayout;

import static java.lang.System.out;

public class JOLExample03 {
    static A a;

    public static void main(String[] args) throws InterruptedException {
        //   -XX:+UseBiasedLocking -XX:BiasedLockingStartupDelay=0
//        TimeUnit.MICROSECONDS.sleep(50000);
//        TimeUnit.SECONDS.sleep(5);
//        Thread.sleep(50000);
        a = new A();
        out.println("before lock");
        out.println(ClassLayout.parseInstance(a).toPrintable());
        a.hashCode();

        sync();

        out.println("after locking");
        out.println(ClassLayout.parseInstance(a).toPrintable());

    }

    //    public static synchronized void sync() {
//        out.println("locking");
//        out.println(ClassLayout.parseInstance(a).toPrintable());
//    }
    public static void sync() {
        synchronized (a) {
            out.println("locking");
            out.println(ClassLayout.parseInstance(a).toPrintable());
        }
    }

}


