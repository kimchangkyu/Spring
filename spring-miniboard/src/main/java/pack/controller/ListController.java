package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pack.model.BoardDao;

@Controller
public class ListController {
	@Autowired
	@Qualifier("boardDao")
	private BoardDao dao;
	
	@RequestMapping("list")
	public ModelAndView list() {
		List list = dao.getList();
		return new ModelAndView("list", "list", list); // list.jsp에, list라는 키로, list를 보내는 것이다. // 순서대로
	}
}
