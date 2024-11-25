package com.builder.task3;

public class Main {
    public static void main(String[] args) {
        MyImage image1 = new ProxyImage("/Users/ira/Desktop/Зображення.jpg");
        MyImage image2 = new ProxyImage("/Users/ira/Desktop/Зображення2.jpg");

        image1.display();
        image2.display();
    }
}
