package com.yougou.controller;

import java.util.ArrayList;
import java.util.List;

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
	public List<GitMoney> selectAllGitMoney(String name) {
		List<GitMoney> list = new ArrayList<GitMoney>();
		if (name == null || name == "") {
			List<GitMoney> gitMoneys = gitMoneyService.selectGitMoneys();
			list.addAll(gitMoneys);
		} else {
			GitMoney gitMoney = gitMoneyService.getGitMoneyByName(name);
			list.add(gitMoney);
		}
		return list;
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
	@RequestMapping("get-update-git-money")
	public String getUpdateGitMoney(String id, Model model) {
		GitMoney gitMoney = gitMoneyService.getGitMoneyById(id);
		model.addAttribute("gitMoney",gitMoney);
		return "get-update-git-money";
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