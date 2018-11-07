package com.yougou.controller;

import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yougou.util.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yougou.pojo.GitMoney;
import com.yougou.service.GitMoneyService;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 礼钱控制器
 * @author Orange丶Athena
 *
 */
@Controller
public class GitMoneyController {
	
	@Autowired
	private GitMoneyService gitMoneyService;
	
	/**
	 * 进入礼钱页面
	 * @return
	 */
	@RequestMapping("git-money")
	public String toGitMoney() {
		return "git-money";
	}

	/**
	 * 查询所有的数据
	 * @return 所有的数据
     */
	@RequestMapping("select-all-git-money")
	@ResponseBody
	public PageModel<GitMoney> selectAllGitMoney(String name) {
		PageInfo<GitMoney> pageInfo = gitMoneyService.selectGitMoneys();
		int total = (int)pageInfo.getTotal();
		List<GitMoney> list = pageInfo.getList();
		PageModel<GitMoney> pageModel = new PageModel<GitMoney>(1, 20, total, list);
		return pageModel;
	}

	/**
	 * 进入新增页面
	 * @return 新增页面
     */
	@RequestMapping("add-git-money-page")
	public String addGitMoneyPage() {
		return "add-git-money-page";
	}

	/**
	 * 保存新增记录
	 * @param gitMoney
     */
	@RequestMapping("add-git-money")
	@ResponseBody
	public void addGitMoney(GitMoney gitMoney) {
		gitMoneyService.insertGitMoney(gitMoney);
	}

	/**
	 * 查看
	 * @param id 主键id
	 * @param model 视图模型
     * @return
     */
	@RequestMapping("get-git-money")
	public String getGitMoney(String id, Model model) {
		GitMoney gitMoney = gitMoneyService.getGitMoneyById(id);
		model.addAttribute("gitMoney",gitMoney);
		return "get-git-money";
	}

	/**
	 * 进入修改页面
	 * @param id 主键id
	 * @param model 视图模型
     * @return
     */
	@RequestMapping("update-git-money-page")
	public String getUpdateGitMoney(String id, Model model) {
		GitMoney gitMoney = gitMoneyService.getGitMoneyById(id);
		model.addAttribute("gitMoney",gitMoney);
		return "update-git-money-page";
	}

	/**
	 * 保存修改后的结果
	 * @param gitMoney 修改后的gitMoney
     */
	@RequestMapping("update-git-money")
	@ResponseBody
	public void updateGitMoney(GitMoney gitMoney) {
		gitMoneyService.updateGitMoney(gitMoney);
	}

	/**
	 * 删除
	 * @param id 主键id
	 * @return 删除的数量
     */
	@RequestMapping("delete-git-money")
	@ResponseBody
	public int deleteGitMoney(String id) {
		return gitMoneyService.deleteGitMoneyById(id);
	}
}