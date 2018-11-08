package com.yougou.service.impl;

import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yougou.util.PageModel;
import com.yougou.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yougou.mapper.GitMoneyMapper;
import com.yougou.pojo.GitMoney;
import com.yougou.service.GitMoneyService;

/**
 * 礼钱service实现类
 * @author Orange丶Athena
 *
 */
@Service
public class GitMoneyServiceImpl implements GitMoneyService {

	@Autowired
	private GitMoneyMapper gitMoneyMapper;
	
	@Override
	public PageInfo<GitMoney> selectGitMoneys(PageModel pageModel, String name) {
		PageHelper.startPage(pageModel.getPage(), pageModel.getLimit());
		List<GitMoney> list = gitMoneyMapper.selectGitMoneys(name);
		PageInfo<GitMoney> pageInfo = new PageInfo<GitMoney>(list);
		return pageInfo;
	}

	@Override
	public void insertGitMoney(GitMoney gitMoney) {
		String id = UUIDUtil.getUUID();
		gitMoney.setId(id);
		gitMoneyMapper.insertGitMoney(gitMoney);
	}

	@Override
	public GitMoney getGitMoneyById(String id) {
		return gitMoneyMapper.getGitMoneyById(id);
	}

	@Override
	public void updateGitMoney(GitMoney gitMoney) {
		gitMoneyMapper.updateGitMoney(gitMoney);
	}

	@Override
	public int deleteGitMoneyById(String id) {
		return gitMoneyMapper.deleteGitMoneyById(id);
	}

}
