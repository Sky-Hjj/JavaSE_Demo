package Thread;
/*
 *  ��ȡ�߳�����,����Thread����
 *    String getName()
 */
public class NameThread extends Thread{
	public void run(){
		System.out.println(getName());
	}
}
