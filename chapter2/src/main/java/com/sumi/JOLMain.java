package com.sumi;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

public class JOLMain {
    public static void main(String[] args) {

        System.out.println(VM.current().details());

        AClass aClass = new AClass();
        System.out.println(ClassLayout.parseInstance(aClass).toPrintable());
        BClass bClass = new BClass();
        System.out.println(ClassLayout.parseInstance(bClass).toPrintable());
        CClass cClass = new CClass();
        System.out.println(ClassLayout.parseInstance(cClass).toPrintable());

        int[] aa = new int[1];
        System.out.println(ClassLayout.parseInstance(aa).toPrintable());


    }
}
