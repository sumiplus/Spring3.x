package org.openjdk.jol.samples;

public class B {
    int i = 0;

    public synchronized void parse() {
        i++;
    }
}
