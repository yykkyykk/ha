package com.thread;

public class Test {
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			if(i==5){
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO 自动生成的方法存根
						 for(int i = 0 ; i < 10 ;i++){
	                            System.out.println("播放音乐"+i);
	                        }
					}
				}).start();
			}
				
		}
	}
}
