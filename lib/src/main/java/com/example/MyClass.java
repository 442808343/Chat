package com.example;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class MyClass {
    public MyClass(){
        try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("119.39.26.150", 9999));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        MyClass Service = new MyClass();
    }
}
