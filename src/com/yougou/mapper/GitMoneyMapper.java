package com.yougou.mapper;

import java.util.List;
import com.yougou.pojo.GitMoney;
import org.apache.ibatis.annotations.Param;

/**
 * 礼钱mapper接口
 * @author Orange丶Athena
 */
public interface GitMoneyMapper {
	/**
	 * 查询所有的数据
	 * @return
	 */
	List<GitMoney> selectGitMoneys(@Param("name") String name);

	/**
	 * 新增gitMoney
	 * @param gitMoney 新增的gitMoney
	 */
	void insertGitMoney(GitMoney gitMoney);

	/**
	 * 根据id查询数据
	 * @param id 主键id
	 * @return 一条记录
	 */
	GitMoney getGitMoneyById(String id);

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
