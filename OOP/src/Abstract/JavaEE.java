package Abstract;

/*
 *  ����JavaEE��������ʦ��
 *    ����,���� ��������
 *  ������Ա��,Ҳ�߱���Щ����,��ȡ��������,�Լ��Ͳ���Ҫ������
 *  ���з���Ա����һ��,�̳��з�����
 */
public class JavaEE extends Develop {
	// ��д������ĸ���ĳ��󷽷�
	@Override
	public void work() {
		// ���ø����get����,��ȡname,idֵ
		System.out.println("JavaEE�Ĺ���ʦ�����Ա�" + super.getName() + ".." + super.getId() + ".." + super.getAge());
	}

}