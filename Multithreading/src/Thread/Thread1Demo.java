package Thread;
/*
 * ����������һ���߳�
 *   ����Thread�������
 *   ���������÷���start()
 *   ���̳߳���ִ��,JVM�����߳��е�run
 */
public class Thread1Demo {
	public static void main(String[] args) {
		Thread1 st = new Thread1();
		Thread1 st1 = new Thread1();
		st.start();
		st1.start();
	}
}
