package com.yougou.pojo;

/**
 * 礼钱
 * @author Orange丶Athena
 */
public class GitMoney {
	/**
	 * 主键id
	 */
	private String id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 钱
	 */
	private Integer money;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

}
