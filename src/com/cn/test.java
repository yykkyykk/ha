package com.cn;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	   @Test
	    public void testNoTransaction(){
	        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	        AccountService account = (AccountService) context.getBean("accountService");
	        //Tom �� Marry ת��1000
	        account.transfer("Tom", "Marry", 1000);
	    }
}
