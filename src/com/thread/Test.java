package com.thread;

public class Test {
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			if(i==5){
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO �Զ����ɵķ������
						 for(int i = 0 ; i < 10 ;i++){
	                            System.out.println("��������"+i);
	                        }
					}
				}).start();
			}
				
		}
	}
}
