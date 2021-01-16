package ArrayDemo;

/*
数组操作中,常见的两个异常
	数组的索引越界异常
	空指针异常
*/
public class ArrayDemo5 {
	public static void main(String[] args) {
		// 数组的索引越界异常
		// int[] arr = {5,2,1};
		// 数组中3个元素,索引 0,1,2
		// System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundsException(数组下标越界)

		// 空指针异常
		int[] arr1 = { 1, 5, 8 };
		System.out.println(arr1[2]);
		arr1 = null; // arr1 不在保存数组的地址了
		System.out.println(arr1[2]);// java.lang.NullPointerException(空指针异常)
	}
}