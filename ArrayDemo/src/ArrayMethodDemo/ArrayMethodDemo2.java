package ArrayMethodDemo;

public class ArrayMethodDemo2 {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 4, 2, 56, 7, 0 };
		// ����ѡ�����򷽷�
		bubbleSort(arr);
		// selectSort(arr);
		printArray(arr);
		int index = binarySearch(arr, 7);
		System.out.println(index);
	}

	/*
	 * ð������: ����������Ԫ�ؽ��бȽϣ� ���Ȼ�ȡ�������ֵ
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			// ÿ����ѭ���ıȽ�,��0������ʼ, ÿ�ζ��ڵݼ�
			for (int j = 0; j < arr.length - i - 1; j++) {
				// �Ƚϵ�����,���������
				// ���j��j+1�󣬽���λ�û��������������
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/*
	 * ѡ������; 
	 * ��ѭ��,���Ƶ���һ���Ƚ��˶��ٴ� 
	 * ��ѭ��,���Ƶ���ÿ�αȽ��˶��ٸ�Ԫ��,���Ȼ�ȡ����Сֵ
	 */
	public static void selectSort(int[] arr) {
		// ��ѭ���ӵ�һλ�������ڶ�λ
		for (int i = 0; i < arr.length - 1; i++) {
			// ��ѭ��,��ʼֵÿ�α���ѭ����1��ÿ�ζ��ڼ���,
			for (int j = i + 1; j < arr.length; j++) {
				// �����Ԫ�ؽ����жϣ����������
				if (arr[i] > arr[j]) {
					// ����Ļ�λ
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	/*
	 * ���巽��,ʵ�ֹ��� ����ֵ: void ��������: ����
	 */
	public static void printArray(int[] arr) {
		// ���һ��������,��Ҫ���д�ӡ
		System.out.print("[");
		// ������б���
		for (int i = 0; i < arr.length; i++) {
			// �жϱ�������Ԫ��,�ǲ�����������һ��Ԫ��
			// ���ѭ����������length-1
			if (i == arr.length - 1) {
				// ��������Ԫ�غ�]
				System.out.print(arr[i] + "]");
			} else {
				// ������������һ��Ԫ��,�������Ԫ�غͶ���
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
	}

	/*
	 * ���ֲ��� �۰���� 
	 * ǰ��:Ҫ�ҵ���������������. 
	 * ÿ�ζ����м��Ԫ�غ�Ҫ�ҵ�Ԫ�ؽ��бȽ�
	 * 
	 */
	public static int binarySearch(int[] arr, int key) {
		// ��������ָ�������
		int min = 0;//��С
		int max = arr.length - 1;//���
		int mid = 0;//�м�
		// ѭ���۰룬������ min<=max
		while (min <= max) {
			// ��ʽ�������м�����
			mid = (min + max) / 2;
			// �ñ���Ԫ�غ��м�����Ԫ�ؽ��бȽ�
			//���ֵ�����м�����ֵ
			if (key > arr[mid]) {
				//��С���������м�����+1
				min = mid + 1;
				//�������ֵС���м�����ֵ
			} else if (key < arr[mid]) {
				//������������м�����-1
				max = mid - 1;
			} else {
				// �ҵ�Ԫ�أ�����Ԫ������
				return mid;
			}
		}
		//δ�ҵ����Ż�-1
		return -1;
	}
}
