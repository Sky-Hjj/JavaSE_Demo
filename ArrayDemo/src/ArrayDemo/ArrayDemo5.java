package ArrayDemo;

/*
���������,�����������쳣
	���������Խ���쳣
	��ָ���쳣
*/
public class ArrayDemo5 {
	public static void main(String[] args) {
		// ���������Խ���쳣
		// int[] arr = {5,2,1};
		// ������3��Ԫ��,���� 0,1,2
		// System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundsException(�����±�Խ��)

		// ��ָ���쳣
		int[] arr1 = { 1, 5, 8 };
		System.out.println(arr1[2]);
		arr1 = null; // arr1 ���ڱ�������ĵ�ַ��
		System.out.println(arr1[2]);// java.lang.NullPointerException(��ָ���쳣)
	}
}