package ArrayMethodDemo;

public class ArrayMethodDemo2 {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 4, 2, 56, 7, 0 };
		// 调用选择排序方法
		bubbleSort(arr);
		// selectSort(arr);
		printArray(arr);
		int index = binarySearch(arr, 7);
		System.out.println(index);
	}

	/*
	 * 冒泡排序: 数组中相邻元素进行比较； 最先获取到是最大值
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			// 每次内循环的比较,从0索引开始, 每次都在递减
			for (int j = 0; j < arr.length - i - 1; j++) {
				// 比较的索引,大的往后排
				// 如果j比j+1大，进行位置互换，大的往后移
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/*
	 * 选择排序; 
	 * 外循环,控制的是一共比较了多少次 
	 * 内循环,控制的是每次比较了多少个元素,最先获取到最小值
	 */
	public static void selectSort(int[] arr) {
		// 外循环从第一位到倒数第二位
		for (int i = 0; i < arr.length - 1; i++) {
			// 内循环,初始值每次比外循环多1，每次都在减少,
			for (int j = i + 1; j < arr.length; j++) {
				// 数组的元素进行判断，大的往后排
				if (arr[i] > arr[j]) {
					// 数组的换位
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	/*
	 * 定义方法,实现功能 返回值: void 方法参数: 数组
	 */
	public static void printArray(int[] arr) {
		// 输出一半中括号,不要换行打印
		System.out.print("[");
		// 数组进行遍历
		for (int i = 0; i < arr.length; i++) {
			// 判断遍历到的元素,是不是数组的最后一个元素
			// 如果循环变量到达length-1
			if (i == arr.length - 1) {
				// 输出数组的元素和]
				System.out.print(arr[i] + "]");
			} else {
				// 不是数组的最后一个元素,输出数组元素和逗号
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
	}

	/*
	 * 二分查找 折半查找 
	 * 前提:要找的数组必须是有序的. 
	 * 每次都用中间的元素和要找的元素进行比较
	 * 
	 */
	public static int binarySearch(int[] arr, int key) {
		// 定义三个指针变量。
		int min = 0;//最小
		int max = arr.length - 1;//最大
		int mid = 0;//中间
		// 循环折半，条件， min<=max
		while (min <= max) {
			// 公式，计算中间索引
			mid = (min + max) / 2;
			// 让被找元素和中间索引元素进行比较
			//如果值大于中间索引值
			if (key > arr[mid]) {
				//最小索引等于中间索引+1
				min = mid + 1;
				//再如果，值小于中间索引值
			} else if (key < arr[mid]) {
				//最大索引等于中间索引-1
				max = mid - 1;
			} else {
				// 找到元素，返回元素索引
				return mid;
			}
		}
		//未找到，放回-1
		return -1;
	}
}
