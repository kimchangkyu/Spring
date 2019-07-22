package aop2anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("myinit.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:init2.xml"); // 이렇게 쓰는 것이 원래방법 //"classpath:pack/init.xml" : xml이 다른 패키지에 있을 때
		
		LogicInter inter = (LogicInter)context.getBean("logicImpl");
		inter.selectData_process();
	}
}
