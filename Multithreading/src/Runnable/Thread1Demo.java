package Runnable;

/*
 *  ʵ�ֽӿڷ�ʽ���߳�
 *    ����Thread�����,���췽����,����Runnable�ӿ�ʵ����
 *    ����Thread�෽��start()
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
