package Thread;

/*
 *  ÿ���߳�,�����Լ�������
 *  ���з���main�߳�,���־���"main"
 *  �����¼����߳�Ҳ������,Ĭ�� "Thread-0","Thread-1"
 *  
 *  JVM�������߳�,���з���main,���߳�Ҳ���߳�,���̱߳�Ȼ����
 *  Thread�����
 *  Thread����,��̬����
 *   static Thread currentThread()��������ִ�е��̶߳���
 */
public class NameThreadDemo {
	public static void main(String[] args) {
		NameThread nt = new NameThread();
		nt.setName("����");
		nt.start();
		
		/*Thread t =Thread.currentThread();
		System.out.println(t.getName());*/
		System.out.println(Thread.currentThread().getName());


	}
}
