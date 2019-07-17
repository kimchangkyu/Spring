package spr6anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


// @Component // 스스로 객체를 만듬 -> new 한것과 같음
@Service // @Service로 쓸 수 도 있다. => 비즈니스 로직을 수행하는 객체인것을 알 수 있다. 비즈니스 로직 부분을 이런식으로 쓴다. 그리고 가독성을 위해서도 이렇게 쓴다
		// @Service == @Service("senderProcess) ==> 메인의 "senderProcess"의 이름과 같게 해야 한다.
// 비즈니스 로직부분에서 인터페이스를 생략하고 있다.
public class SenderProcess {
	@Autowired // @Autowired : 자동으로 객체를 찾아서 주소를 전달한다.
			   // setter와 같은 작업을 내부적으로 진행한다. // @Autowired : 자동으로 연결의미
			   // @Component가 두개 이상일 때는 어떤 것을 찾을 건지나 순서를 정해 줄때의 순위를 정해주어야 한다. ==> @Qualifier("sender1") -> 이런식으로 만들어 주어야 한다.
	@Qualifier("sender2")
	private SenderInter inter;
	
//	public void setInter(SenderInter inter) {
//		this.inter = inter;
//	}
	
	public void ShowData() {
		inter.show();
	}
}
