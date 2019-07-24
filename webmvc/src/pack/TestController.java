package pack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//public class TestController implements Controller{
//	
//	public ModelAndView handleRequest(HttpServletRequest request) {
//		String msg = "모델로부터 자료를 읽음";
//		
//		ModelAndView andView = new ModelAndView();
//		andView.addObject("say", msg);
//		andView.setViewName("list");
//		return andView;
//	}
//}
@org.springframework.stereotype.Controller
public class TestController{
	@RequestMapping("index.do")
	public ModelAndView abc() {
		String msg = "모델로부터 자료를 읽음";
		
		ModelAndView andView = new ModelAndView();
		andView.addObject("say", msg); // 키, 밸류
		andView.setViewName("list"); // list.jsp에 담는다. // 서버에서 서버 => 포워딩만 된다. // redirect(클라인트가 보내는 것)는 spring만 있다.
		return andView;
	}
}