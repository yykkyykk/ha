package com.cn;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService{
	private AccountDao accountDao;
	 private TransactionTemplate transactionTemplate;
	@Override
	public void transfer(final String outer,final String inner,final int money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus arg0) {
                accountDao.out(outer, money);
                //int i = 1/0;
                accountDao.in(inner, money);
            }
        });
    }

}
