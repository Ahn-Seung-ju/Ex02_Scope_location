import kr.or.bit.common.Car;

/*
Ŭ���� == ���赵  ==������ Ÿ��(����� ����)

Ŭ���� ���� ��� : [�ʵ�(�Ӽ�) + �Լ�(���)]  + ������ �Լ�
*field >> ���������� , ���µ����� , ��ǰ(����)���� >> ���� 
*function >> ��� ���� >>�ּ� ����(1���� ���)
*�߰������� ������ �Լ� >>  member field �ʱ�ȭ ����

Ŭ���� , �ʵ� , ������ , �Լ� : ��� ���� ��ġ�ϴ��� (scope)���� >> ������ , ������ , ������

>> public , private , default , protected ( ��� )

1. public class Car{}  >> kr.or.bit.common  ���� �Ʒ� ... 
2. class AirPlane{} >> default ���� >> �����Ϸ��� �ڵ� default �ִ� �� ó�� ... 
   >>default (���� ����)
   >>default �����ڴ� [���� ���� ���� ����][�ٸ� ������ ������ ���� ���� �Ұ�]
   >>default ������ ���� ����(package) ���� ����
   >>program ���� �����ȿ� �ִ� Ŭ������ ��밡��

3. �ϳ��� �������� �ڹ������� �������� Ŭ������ ���� �� �ִ�   (0)
Ex01_main.java >> �������� Ŭ���� >> �� Ex01_main  Ŭ������ public �� ������ >> ������  default
���� ...   
*/
class Test{ //default class Test
	int data; //���� ������ :default
}

class Test2{ //default class Test2
	int data2;
	public int data3; //���� �������� ���� ... >> �ٺ� 
	private int data4; //getter , setter  �Լ�
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
