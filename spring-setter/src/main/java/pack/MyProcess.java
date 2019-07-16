package pack;

public class MyProcess { // MyProcess가 다른 클래스를 포함할 때 -> TestClass
	private int nai;
	private String name;
	private TestClass class1;
	
	public void setClass1(TestClass class1) {
		this.class1 = class1;
	}
	
	public void setNai(int nai) {
		this.nai = nai;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void ShowData() {
		System.out.println("이름은 : " + name + ", 나이는 : " + nai);
		class1.abc(); // class1이 주소를 가지고 있지 않으면 널포인트인셉션이 떨어진다.
		class1.def();
	}
}
