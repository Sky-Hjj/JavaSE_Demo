package ThreadPool;

public class ThreadPoolRunnable implements Runnable {
	public void run(){
		System.out.println(Thread.currentThread().getName()+" �߳��ύ����");
	}
}
