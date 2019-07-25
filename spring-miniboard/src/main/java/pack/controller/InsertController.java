package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pack.model.BoardDao;

@Controller
public class InsertController {
	@Autowired
	private BoardDao dao;
	
	@ModelAttribute("command")
	BoardBean init() {//클라이언트 자료를 BoardBean이 받기 때문에
		return new BoardBean();
	}
	
	@RequestMapping(value="insert", method = RequestMethod.GET)
	public String insert1() {
		return "insform";
	}
	
	@RequestMapping(value="insert", method = RequestMethod.POST)	
	public String insert2(BoardBean bean) {
		int b = dao.insert(bean);
		if (b > 0)
			return "redirect:/list";
		else
			return "redirect:/error.jsp";
	}
}
