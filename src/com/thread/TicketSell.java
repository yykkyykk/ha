package com.thread;

public class TicketSell extends Thread{

	private static int num=50;
	public TicketSell(String string) {
        super(string);
    }
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i=0;i<50;i++){
			synchronized (this.getClass()) {
				if(num>0){
					try{
						sleep(10);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					System.out.println(this.currentThread().getName()+"卖出一张票，剩余"+(--num)+"张");
				}
			}
			
		}
	}
}
