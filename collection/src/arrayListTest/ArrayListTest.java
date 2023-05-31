package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	
	public static void main(String[] args) {
//		<?>: ���׸�(�̸��� ����)
//		��üȭ �� Ÿ���� �����ϴ� ���
//		������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
//		���� �ٿ� ĳ������ �ʿ䰡 ������, ������ Ÿ�Կ� ������ �� �� �ֱ� ������ Object�� �ƴ� ���׸����� �����Ѵ�.
		
//		capacity(�뷮): �̸� Ȯ���� ���� ����, ���� �޸��� �Ѱ踦 Ȯ���� �� �ִ�.
//		�뷮�� ������ �ִ� ���� �ƴϴ�!
		ArrayList<Integer> datas = new ArrayList<>();

//		.add(): ��̸���Ʈ �ȿ� �Ұ�ȣ �� �� �߰�
		datas.add(40);
		datas.add(50);
		datas.add(70);
		datas.add(20);
		datas.add(10);
		datas.add(30);
		datas.add(90);
		datas.add(100);

		System.out.println(datas.size());
		System.out.println(datas);
//		
//		����
		Collections.sort(datas);
		System.out.println(datas);

//		������ ������
		Collections.reverse(datas);
		System.out.println(datas);
		
//		�������� ����
		Collections.shuffle(datas);
		System.out.println(datas);
		
//		�߰�(����) 60�� �׻� 30 �ڿ� ���Եȴ�.
//		.contains(): �Ұ�ȣ �� ���� �����ϰ� �ִٸ�
		if(datas.contains(30)) {
//			.indexOf() : �Ұ�ȣ ���� ���� ��ġ�� �ε���
			datas.add(datas.indexOf(30) + 1, 60);
		}
		System.out.println(datas);
//		���� 10�� 1�� �����Ѵ�.
		if(datas.contains(10)) {
//			.set(�ε���, ��) -> ������ �ε����� ���ο� ���� �ִ´�
			System.out.println(datas.set(datas.indexOf(10), 1) + "�� 1�� ����");
			System.out.println(datas);
		}
		
//		����(������ ����) 20�� �����Ѵ�.
//		.remove() �Ұ�ȣ�� Object Ÿ�� ��ü�� ���� �ϹǷ�
//		�Ϲ�Ÿ�� int�� �ƴ� wrapperŬ������ ���� 20�� �ִ´�
//		Integer.valueOf(20)
		if(datas.remove(Integer.valueOf(20))) {
			System.out.println("���� ����");
			System.out.println(datas);
		}
//		����(�ε����� ����) 50�� �����Ѵ�.
		if(datas.contains(50)) {
			System.out.println(datas.remove(datas.indexOf(50)) + "����");
			System.out.println(datas);
		}
		

		
	}
}