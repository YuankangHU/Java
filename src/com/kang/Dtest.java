package com.kang;

public class Dtest {
    public static void main(String[] args) {
        A a1 = new A();
        a1.setA(3);
        System.out.println(a1.getA());
    }
}

class A{
    private int a = 2;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}