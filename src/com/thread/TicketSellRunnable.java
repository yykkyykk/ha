package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketSellRunnable implements Runnable{
	private int num = 50;
	Lock l = new ReentrantLock();
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i=0;i<50;i++){
			l.lock();
			   if(num > 0){
	                //ģ����һ��Ʊ����ʱ��
	                try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
	                System.out.println(Thread.currentThread().getName()+"����һ��Ʊ��ʣ��"+(--num)+"��");
	                }
			   l.unlock();
		}
	}

}
