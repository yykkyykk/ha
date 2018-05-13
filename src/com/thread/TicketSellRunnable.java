package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketSellRunnable implements Runnable{
	private int num = 50;
	Lock l = new ReentrantLock();
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i=0;i<50;i++){
			l.lock();
			   if(num > 0){
	                //模拟卖一次票所需时间
	                try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
	                System.out.println(Thread.currentThread().getName()+"卖出一张票，剩余"+(--num)+"张");
	                }
			   l.unlock();
		}
	}

}
