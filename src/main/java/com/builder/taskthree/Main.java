package com.builder.taskthree;

public class Main {
    public static void main(String[] args) {
        MyImage image1 = new ProxyImage("/Users/ira/Desktop/Зображення.jpg");
        MyImage image2 = new ProxyImage("/Users/ira/Desktop/Зображення2.jpg");

        image1.display();
        image2.display();
    }
}
