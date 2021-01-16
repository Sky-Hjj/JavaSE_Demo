package Regex;
/*
 *    String replaceAll( String 正则规则,String 字符串)
 *    "abc0123".repalceAll("[\\d]","#")
 *    安装正则的规则,替换字符串
 */
public class RegexReplaceAll {
	public static void main(String[] args) {
		replaceAll_1();
	}
	
	/*
	 * "Hello12345World6789012"将所有数字替换掉
	 * String类方法replaceAll(正则规则,替换后的新字符串)
	 */
	public static void replaceAll_1(){
		String str = "Hello12345World6789012";
		str = str.replaceAll("[\\d]+", "#");
		System.out.println(str);
	}
}
