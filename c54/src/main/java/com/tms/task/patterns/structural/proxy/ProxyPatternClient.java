package com.tms.task.patterns.structural.proxy;

public class ProxyPatternClient {

    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Igor");

        access.grantInternetAccess();
    }
}