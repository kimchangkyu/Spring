package aop2anno;
// 비즈니스로직 부분이 아니다 데이터베이스와 연동하는 부분

import org.springframework.stereotype.Repository;

@Repository  //컴포넌트를 한것이다.
public class ArticleDao implements ArticleInter{
	public void selectAll() {
		System.out.println("DB 자료 읽기 성공");
	}
}
