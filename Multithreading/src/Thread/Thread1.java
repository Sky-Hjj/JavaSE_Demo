package Thread;

/*
 *  ��������,�̳�Thread 
 *  ��д����run 
 */
public class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("run..." + i);
		}
	}
}
