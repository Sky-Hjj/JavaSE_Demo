package Regex;
/*
 *    String replaceAll( String �������,String �ַ���)
 *    "abc0123".repalceAll("[\\d]","#")
 *    ��װ����Ĺ���,�滻�ַ���
 */
public class RegexReplaceAll {
	public static void main(String[] args) {
		replaceAll_1();
	}
	
	/*
	 * "Hello12345World6789012"�����������滻��
	 * String�෽��replaceAll(�������,�滻������ַ���)
	 */
	public static void replaceAll_1(){
		String str = "Hello12345World6789012";
		str = str.replaceAll("[\\d]+", "#");
		System.out.println(str);
	}
}
