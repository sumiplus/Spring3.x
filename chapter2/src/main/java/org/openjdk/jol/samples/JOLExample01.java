package org.openjdk.jol.samples;

import org.openjdk.jol.info.ClassLayout;

import static java.lang.System.out;

public class JOLExample01 {

    public static void main(String[] args) {
        out.println(ClassLayout.parseClass(A.class).toPrintable());
        A a = new A();
        out.println(ClassLayout.parseInstance(a).toPrintable());
    }
}
