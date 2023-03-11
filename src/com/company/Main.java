package com.company;


public class Main {

    public static void main(String[] args) {
        // write your code here
        DataSource dataSource = new DataSource(5);
        DataListener listener = new DataListener();

        dataSource.addObserver(listener);
        dataSource.setValueExample(4);
        dataSource.setValueExample(3);
    }
}
