package com.thread;

public class TestTicket {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
    TicketSell t1=new TicketSell("A����");
    TicketSell t2=new TicketSell("B����");
    TicketSell t3=new TicketSell("C����");
    t1.start();
    t2.start();
    t3.start();
	}

}
