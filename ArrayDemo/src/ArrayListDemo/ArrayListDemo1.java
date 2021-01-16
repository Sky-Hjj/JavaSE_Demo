package ArrayListDemo;

import java.util.ArrayList;

/*
ArrayList是引用数据类型
步骤:
	1. 导入包 java.util包中
	2. 创建引用类型的变量
	   	数据类型< 集合存储的数据类型>  变量名 = new 数据类型 <集合存储的数据类型>  ();
	   	创建集合引用变量的时候,必须要指定好,存储的类型是什么；
	   	集合存储的数据类型: 要将数据存储到集合的容器中的数据类型	  	   
		ArrayList<String> array = new ArrayList<String>();	  
	3. 变量名.方法 
	注意: 集合存储的数据,8个基本类型对应8个引用类型
	存储引用类型,不存储基本类型
	3. 
	add(int 索引,存储的元素) 将元素添加到指定的索引上
	set(int 索引,修改后的元素) 将指定索引的元素,进行修改
	remove(int 索引) 删除指定索引上的元素
	clear() 清空集合中的所有元素
*/
public class ArrayListDemo1 {
	public static void main(String[] args) {
		// 定义集合,存储字符串元素
		ArrayList<String> array = new ArrayList<String>();
		// 调用集合方法add存储元素
		array.add("ABC");
		array.add("DEF");
		// 输出集合的长度,调用集合方法size, size方法的返回值类型 int
		System.out.println("长度"+array.size());
		
		array.add(1,"Hjj");
		array.set(2,"Sky");
		array.remove(1);
		array.clear();
		// 对集合进行遍历
		// 使用方法 size+get组合进行遍历
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
