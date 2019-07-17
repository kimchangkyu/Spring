package spr6anno;

import org.springframework.stereotype.Component;

@Component
public class Sender2 implements SenderInter{
	public void show() {
		System.out.println("Sender2 수행");
	}
}
