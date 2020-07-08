package com.liyang.web.service.demo;

public class AServiceImpl implements Aservice {
    public void barA() {
        System.out.println("AServiceImpl.barA()");
    }

    public void fooA(String _msg) {
        System.out.println("AServiceImpl.fooA(msg:" + _msg + ")");
    }
}
