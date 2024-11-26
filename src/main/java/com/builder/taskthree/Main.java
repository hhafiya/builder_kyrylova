package com.builder.taskthree;

public class Main {
    public static void main(String[] args) {
        MyImage imageOne = new ProxyImage("/Users/ira/Desktop/Зображення.jpg");
        MyImage imageTwo = new ProxyImage("/Users/ira/Desktop/Зображення2.jpg");

        imageOne.display();
        imageTwo.display();
    }
}
