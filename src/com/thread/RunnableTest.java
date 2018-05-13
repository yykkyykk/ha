package com.thread;

public class RunnableTest {
	public static void main(String[] args) {
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("ÍæÓÎÏ·"+i);
            if(i==5){
                Thread th1 = new Thread(new Runnable2());
                th1.start();
            }
        }
    }
}
