package ArrayDemo2;
/*
int[][] arr = new int[3][] ���Ƽ�
��ά�����ж�������һά����,ÿ��һά���鳤��,û��ָ��
����Ҫnew
	arr[0] = new int[5];
	arr[1] = new int[4];
	arr[2] = new int[8];
	
  
��򵥵Ķ�ά���鶨�巽ʽ
  int[][] arr = { {1,4} ,{3,6,8}, {0,9,8} };
*/

public class TwoArrayDemo2 {
	public static void main(String[] args){
		int[][] arr = { {1,2,3},{4,5},{6,7,8,9},{0} };		
		
		//��ӡ7
		System.out.println(arr[2][1]);
		
		//6
		System.out.println(arr[3][0]);
	}
}
