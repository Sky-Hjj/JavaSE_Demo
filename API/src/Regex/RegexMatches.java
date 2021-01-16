package Regex;
/*
 *  实现正则规则和字符串进行匹配,使用到字符串类的方法
 *  String类三个和正则表达式相关的方法
 *  boolean matches(String 正则的规则)
 *  "abc".matches("[a]")  匹配成功返回true   
 */ 
public class RegexMatches {
	public static void main(String[] args) {
		checkTel();
		checkQQ();
	}
	
	
	/*
	 *  检查手机号码是否合法
	 *  1开头 可以是34578  0-9 位数固定11位
	 */
	public static void checkTel(){
		String telNumber = "13351280052";
		//String类的方法matches
		boolean b = telNumber.matches("1[34857][\\d]{5}[\\d]{4}");
		System.out.println(b);
	}
	
	/*
	 *  检查QQ号码是否合法
	 *  0不能开头,全数字, 位数5,10位
	 *  123456 
	 *  \\d  \\D匹配不是数字
	 */
	public static void checkQQ(){
		String QQ = "123456";
		//检查QQ号码和规则是否匹配,String类的方法matches
		boolean b = QQ.matches("[1-9][\\d]{4,9}");
		System.out.println(b);
	}
}






