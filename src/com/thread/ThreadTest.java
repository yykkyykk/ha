package com.thread;

public class ThreadTest {
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			 System.out.println("ÍæÓÎÏ·"+i);
			 if(i==5){
				 Thread1 t=new Thread1();
				 t.start();
			 }
		}
	}
}
