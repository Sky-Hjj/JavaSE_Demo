package ArrayListDemo;

import java.util.ArrayList;
import java.util.Random;

/*
���������(ѧ��������������)
��ʵ����ѧ���������,ʹ�ö��������ʽ,����ѧ������
����: ����,����

String[] s = {"",""};
������,�洢����ѧ��������,Ӧ�ô洢Student����

�洢ѧ��:
   	ѧ������,�洢��������
	����: ��������
	���: �����,��Ϊ����,���������ҵ�Ԫ��
	��������,������������,���������,��������,����������ݼ���
*/
public class CallName {
	public static void main(String[] args) {
		// ���弯��,�洢����StudentName���ͱ���
		ArrayList<Student> array = new ArrayList<Student>();
		// ������ӷ���
		add(array);
		// ���ñ�������
		printArrayList(array);
		// ���������ȡѧ��
		randomStudentName(array);
	}

	/*
	 * �����,�������ϵ�����,���������ҵ�Ԫ��
	 */
	public static void randomStudentName(ArrayList<Student> array) {
		Random r = new Random();
		int number = r.nextInt(array.size());
		// �����,����,��������get
		Student s = array.get(number);
		System.out.println(s.name + "  " + s.age);
	}

	/*
	 * ����ѧ������Ϣ,��������
	 */
	public static void printArrayList(ArrayList<Student> array) {
		for (int i = 0; i < array.size(); i++) {
			// �洢���ϵ�ʱ��, ����.add(sn1) sn1 ��StudentName���ͱ���
			// ��ȡ��ʱ��,����.get����,��ȡ��������ʲô, ����StudentName���ͱ���
			Student s = array.get(i);
			System.out.println(s.name + "  " + s.age);
		}
	}

	/*
	 * ���巽��,ʵ�ִ洢ѧ�������������� ����StudentName���ͱ���,�洢��������
	 */
	public static void add(ArrayList<Student> array) {
		// ����StudentName���ͱ���
		Student sn1 = new Student();
		Student sn2 = new Student();
		Student sn3 = new Student();
		Student sn4 = new Student();
		Student sn5 = new Student();

		sn1.name = "����1";
		sn1.age = 21;

		sn2.name = "����2";
		sn2.age = 22;

		sn3.name = "����3";
		sn3.age = 23;

		sn4.name = "����4";
		sn4.age = 24;

		sn5.name = "����5";
		sn5.age = 25;

		// ��StudentName����,�洢��������
		array.add(sn1);
		array.add(sn2);
		array.add(sn3);
		array.add(sn4);
		array.add(sn5);
	}
}
