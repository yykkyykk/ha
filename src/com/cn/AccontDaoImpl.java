package com.cn;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccontDaoImpl extends JdbcDaoSupport implements AccountDao{

	@Override
	public void out(String outer, int money) {
		// TODO 自动生成的方法存根
		this.getJdbcTemplate().update("update account set money = money - ? where username = ?",money,outer);
	}

	@Override
	public void in(String inner, int money) {
		// TODO 自动生成的方法存根
		  this.getJdbcTemplate().update("update account set money = money + ? where username = ?",money,inner);
	}

}
