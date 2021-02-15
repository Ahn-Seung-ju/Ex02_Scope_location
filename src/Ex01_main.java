import kr.or.bit.common.Car;

/*
클래스 == 설계도  ==데이터 타입(사용자 정의)

클래스 구성 요소 : [필드(속성) + 함수(기능)]  + 생성자 함수
*field >> 고유데이터 , 상태데이터 , 부품(참조)정보 >> 변수 
*function >> 기능 행위 >>최소 단위(1개의 기능)
*추가적으로 생성자 함수 >>  member field 초기화 목적

클래스 , 필드 , 생성자 , 함수 : 어느 곳에 위치하느냐 (scope)영역 >> 접근자 , 한정자 , 수정자

>> public , private , default , protected ( 상속 )

1. public class Car{}  >> kr.or.bit.common  폴더 아래 ... 
2. class AirPlane{} >> default 생략 >> 컴파일러가 자동 default 있는 것 처럼 ... 
   >>default (같은 폴더)
   >>default 접근자는 [같은 폴더 접근 가능][다른 폴더에 있으면 서로 접근 불가]
   >>default 접근자 같은 폴더(package) 연습 목적
   >>program 같은 폴더안에 있는 클래스는 사용가능

3. 하나의 물리적인 자바파일은 여러개의 클래스를 가질 수 있다   (0)
Ex01_main.java >> 여러개의 클래스 >> 단 Ex01_main  클래스만 public 을 가진다 >> 나머지  default
연습 ...   
*/
class Test{ //default class Test
	int data; //접근 제한자 :default
}

class Test2{ //default class Test2
	int data2;
	public int data3; //문법 적으로으 오류 ... >> 바보 
	private int data4; //getter , setter  함수
	void setData4(int d) {
		data4 = d;
	}
	int getData4() {
		return data4;
	}
}
public class Ex01_main {
	public static void main(String[] args) {
		Car car = new Car();
	
		
		Test test = new Test();
		test.data = 100;
		System.out.println(test.data);
		
		Test2 test2 = new Test2();
		test2.data2=1;
		test2.data3=2;
		test2.setData4(3);
		System.out.println(test2.getData4());
		

	}

}
