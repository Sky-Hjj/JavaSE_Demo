package Construction;

/*
 *  研发部类,属于员工的一种,继承员工类
 */
public abstract class Developer extends Employee{
	private String age;
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Developer(String name,String id){
		super(name, id);
	}
//	public abstract void work();
}
