package ArrayDemo2;

/*
    ��ά����
	  �����е�����,��������洢�Ļ�������
	  
	���巽ʽ��һά���������
	
	int[][] arr = new int[3][4];
	����һ����ά����
	[3]  ��ʾ: ��ά������,������һά����
	[4]  ��ʾ: ����һά������,ÿ������ĳ�����4
*/
public class TwoArrayDemo1 {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		System.out.println("��ά�����ַ"+arr);

		System.out.println("һά�����ַ"+arr[0]);
		System.out.println(arr[0][0]);
	}
}