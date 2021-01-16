package Regex;
/*
*    String[] split(String ����Ĺ���)
*    "abc".split("a") ʹ�ù����ַ��������и�
*/
public class RegexSplit {
	public static void main(String[] args) {
		split_1();
		split_2();
		split_3();
	}

	/*
	 * String�෽��split���ַ��������и� 192.168.105.27 ���� ���и��ַ���
	 */
	public static void split_3() {
		String ip = "192.168.105.27";
		String[] strArr = ip.split("\\.");
		System.out.println("����ĳ���" + strArr.length);
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}

	/*
	 * String�෽��split���ַ��������и� 18 22 40 65 ���տո��и��ַ���
	 */
	public static void split_2() {
		String str = "18    22     40          65";
		String[] strArr = str.split(" +");
		System.out.println("����ĳ���" + strArr.length);
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}

	/*
	 * String�෽��split���ַ��������и� 12-25-36-98 ����-���ַ��������и�
	 */
	public static void split_1() {
		String str = "12-25-36-98";
		// ����-���ַ��������и�,String�෽��split
		String[] strArr = str.split("-");
		System.out.println("����ĳ���" + strArr.length);
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
}
