package ArrayListDemo;

import java.util.ArrayList;
import java.util.Random;

/*
随机点名器(学生的姓名和年龄)
现实中有学生这个事物,使用定义类的形式,描述学生事物
属性: 姓名,年龄

String[] s = {"",""};
集合中,存储的是学生的姓名,应该存储Student类型

存储学生:
   	学生类型,存储到集合中
	总览: 遍历集合
	随机: 随机数,作为索引,到集合中找到元素
	三个功能,定义三个方法,共享的数据,集合容器,必须参数传递集合
*/
public class CallName {
	public static void main(String[] args) {
		// 定义集合,存储的是StudentName类型变量
		ArrayList<Student> array = new ArrayList<Student>();
		// 调用添加方法
		add(array);
		// 调用遍历集合
		printArrayList(array);
		// 调用随机获取学生
		randomStudentName(array);
	}

	/*
	 * 随机数,当作集合的索引,到集合中找到元素
	 */
	public static void randomStudentName(ArrayList<Student> array) {
		Random r = new Random();
		int number = r.nextInt(array.size());
		// 随机数,索引,到集合中get
		Student s = array.get(number);
		System.out.println(s.name + "  " + s.age);
	}

	/*
	 * 总览学生的信息,遍历集合
	 */
	public static void printArrayList(ArrayList<Student> array) {
		for (int i = 0; i < array.size(); i++) {
			// 存储集合的时候, 集合.add(sn1) sn1 是StudentName类型变量
			// 获取的时候,集合.get方法,获取出来的是什么, 还是StudentName类型变量
			Student s = array.get(i);
			System.out.println(s.name + "  " + s.age);
		}
	}

	/*
	 * 定义方法,实现存储学生的姓名和年龄 创建StudentName类型变量,存储到集合中
	 */
	public static void add(ArrayList<Student> array) {
		// 创建StudentName类型变量
		Student sn1 = new Student();
		Student sn2 = new Student();
		Student sn3 = new Student();
		Student sn4 = new Student();
		Student sn5 = new Student();

		sn1.name = "张三1";
		sn1.age = 21;

		sn2.name = "张三2";
		sn2.age = 22;

		sn3.name = "张三3";
		sn3.age = 23;

		sn4.name = "张三4";
		sn4.age = 24;

		sn5.name = "张三5";
		sn5.age = 25;

		// 将StudentName变量,存储到集合中
		array.add(sn1);
		array.add(sn2);
		array.add(sn3);
		array.add(sn4);
		array.add(sn5);
	}
}
