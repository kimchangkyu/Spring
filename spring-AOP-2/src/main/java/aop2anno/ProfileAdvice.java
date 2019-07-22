package aop2anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProfileAdvice { // Advice, Aspect(관심사항을 가진 클래스)
	@Around("execution(public * aop2anno..*(..))")
	public Object kbs(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("핵심 메소드 수행 전 작업 : 로그인, 보안, 트랜잭션...");
		
		Object object = joinPoint.proceed(); // 핵심 메소드를 스스로 찾아서 수행
		
		System.out.println("핵심 메소드 수행 후 하고 싶은 것 기술");
		
		return object;
	}

}
