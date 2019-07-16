package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		System.out.println("성공");
		
		Message1 message1 = new Message1();
		message1.sayHello("tom");
		
		MessageInter inter;
		inter = message1;
		inter.sayHello("james"); // tom과 james는 기본 정통 방식
		
		System.out.println();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		MessageInter inter2 = (MessageInter)context.getBean("mes1");
		inter2.sayHello("oscar"); // spring을 사용한 방법
	}
}
