package com.thread;

public class TestTicket {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    TicketSell t1=new TicketSell("A窗口");
    TicketSell t2=new TicketSell("B窗口");
    TicketSell t3=new TicketSell("C窗口");
    t1.start();
    t2.start();
    t3.start();
	}

}
