package com.yougou.service;

import java.util.List;

import com.yougou.pojo.GitMoney;

/**
 * 礼钱service接口
 * @author Orange丶Athena
 *
 */
public interface GitMoneyService {
	/**
	 * 查询所有的数据
	 * @return 数据列表
	 */
	List<GitMoney> selectGitMoneys();

	/**
	 * 根据id查询数据
	 * @param id 主键id
	 * @return 一条记录
     */
	GitMoney getGitMoneyById(String id);

	/**
	 * 根据姓名查询数据
	 * @param name 姓名
	 * @return 一条数据
     */
	GitMoney getGitMoneyByName(String name);

	/**
	 * 修改gitMoney
	 * @param gitMoney 修改后的gitMoney
     */
	void updateGitMoney(GitMoney gitMoney);

	/**
	 * 根据id删除数据
	 * @param id 主键id
	 * @return 删除的数量
     */
	int deleteGitMoneyById(String id);
}