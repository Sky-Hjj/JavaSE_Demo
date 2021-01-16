package ArrayListDemo;

import java.util.ArrayList;

/*
ArrayList��������������
����:
	1. ����� java.util����
	2. �����������͵ı���
	   	��������< ���ϴ洢����������>  ������ = new �������� <���ϴ洢����������>  ();
	   	�����������ñ�����ʱ��,����Ҫָ����,�洢��������ʲô��
	   	���ϴ洢����������: Ҫ�����ݴ洢�����ϵ������е���������	  	   
		ArrayList<String> array = new ArrayList<String>();	  
	3. ������.���� 
	ע��: ���ϴ洢������,8���������Ͷ�Ӧ8����������
	�洢��������,���洢��������
	3. 
	add(int ����,�洢��Ԫ��) ��Ԫ����ӵ�ָ����������
	set(int ����,�޸ĺ��Ԫ��) ��ָ��������Ԫ��,�����޸�
	remove(int ����) ɾ��ָ�������ϵ�Ԫ��
	clear() ��ռ����е�����Ԫ��
*/
public class ArrayListDemo1 {
	public static void main(String[] args) {
		// ���弯��,�洢�ַ���Ԫ��
		ArrayList<String> array = new ArrayList<String>();
		// ���ü��Ϸ���add�洢Ԫ��
		array.add("ABC");
		array.add("DEF");
		// ������ϵĳ���,���ü��Ϸ���size, size�����ķ���ֵ���� int
		System.out.println("����"+array.size());
		
		array.add(1,"Hjj");
		array.set(2,"Sky");
		array.remove(1);
		array.clear();
		// �Լ��Ͻ��б���
		// ʹ�÷��� size+get��Ͻ��б���
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
