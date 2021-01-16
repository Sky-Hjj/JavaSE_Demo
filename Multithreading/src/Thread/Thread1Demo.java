package Thread;
/*
 * 创建和启动一个线程
 *   创建Thread子类对象
 *   子类对象调用方法start()
 *   让线程程序执行,JVM调用线程中的run
 */
public class Thread1Demo {
	public static void main(String[] args) {
		Thread1 st = new Thread1();
		Thread1 st1 = new Thread1();
		st.start();
		st1.start();
	}
}
