package Construction;

/*
 *  �з�����,����Ա����һ��,�̳�Ա����
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
