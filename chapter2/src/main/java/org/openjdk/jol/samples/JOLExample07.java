package org.openjdk.jol.samples;

public class JOLExample07 {


    public static void main(String[] args) {
        B b = new B();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            b.parse();
        }
        System.out.println(System.currentTimeMillis() - startTime);

        // Biased Locked :      4089ms  -XX:+UseBiasedLocking -XX:BiasedLockingStartupDelay=0
        // lightWeight locked : 30434ms -XX:-UseBiasedLocking
        // heavyWeight Locked : 45830ms
    }
}
