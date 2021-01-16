package Abstract;
/*
 *  定义研发员工抽象类
 *    属于员工中的一种, 继承员工类 
 *    抽象类Develop 给自己的员工定义自己有的属性
 */
public abstract class Develop extends Employee{
	private int age ;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
