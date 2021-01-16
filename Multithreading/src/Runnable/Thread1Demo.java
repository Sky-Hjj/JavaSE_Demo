package Runnable;

/*
 *  实现接口方式的线程
 *    创建Thread类对象,构造方法中,传递Runnable接口实现类
 *    调用Thread类方法start()
 */
public class Thread1Demo {
	public static void main(String[] args) {
		Runnable1 sr = new Runnable1();
		Thread t = new Thread(sr);
		t.start();
		for (int i = 0; i < 50; i++) {
			System.out.println("main..." + i);
		}
	}
}
