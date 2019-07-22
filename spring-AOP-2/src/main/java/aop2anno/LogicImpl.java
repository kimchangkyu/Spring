package aop2anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// 비즈니스 로직 부분
@Service
public class LogicImpl implements LogicInter{
	@Autowired // 타입에 의한 매핑
	@Qualifier("articleDao") //ArticleInter의 자식인 articleDao 
	private ArticleInter articleInter;
	
//	public LogicImpl(ArticleInter articleInter) {
//		this.articleInter = articleInter;
//	}
	
	public void selectData_process() {
		System.out.println("selectData_process 수행");
		articleInter.selectAll(); // articleDao에 있는 selectAll을 호출
	}
}
