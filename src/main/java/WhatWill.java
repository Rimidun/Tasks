public class WhatWill {


    static {
        System.out.println("test1");
    }


    static void create() {
        System.out.println("test3");
    }


    public static void main(String[] args) {
        System.out.println("test4");
        WhatWill.create();
        WhatWill.create();

    }
}
