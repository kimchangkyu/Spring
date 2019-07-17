package spr6anno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// xml에서 만들지 않고 여기서 스스로 객체를 만드는 방법 // 불러서 쓰기 위해서
@Component // == @Component("sender1") 같은 의미 

public class Sender1 implements SenderInter{
	public void show() {
		System.out.println("Sender1 처리");
	}
}
