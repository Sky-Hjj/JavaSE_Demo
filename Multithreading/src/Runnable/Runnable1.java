package Runnable;
/*
 *  ʵ���̳߳ɹ�����һ����ʽ,�ӿ�ʵ��
 *  ʵ�ֽӿ�Runnable,��дrun����
 */
public class Runnable1 implements Runnable{
	public void run(){
		for(int i = 0 ; i < 50; i++){
			System.out.println("run..."+i);
		}
	}
}
