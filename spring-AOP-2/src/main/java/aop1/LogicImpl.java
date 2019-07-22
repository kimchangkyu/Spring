package aop1;
// 비즈니스 로직 부분
public class LogicImpl implements LogicInter{
	private ArticleInter articleInter;
	
	public LogicImpl(ArticleInter articleInter) {
		this.articleInter = articleInter;
	}
	
	public void selectData_process() {
		System.out.println("selectData_process 수행");
		articleInter.selectAll();
	}
}
