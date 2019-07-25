package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pack.model.BoardDao;

@Controller
public class DeleteController {
	@Autowired
	private BoardDao dao;
	
	@RequestMapping("delete")
	public String delete(@RequestParam("num") String num) {
		int b = dao.delete(num);
		if (b > 0)
			return "redirect:/list";
		else
			return "redirect:/error.jsp";
	}
}
