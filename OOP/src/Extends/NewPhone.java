package Extends;

public class NewPhone extends Phone {
	// 覆盖父类的来电显示号码功能，并增加自己的显示姓名和图片功能
	public void showNum() {
		// 调用父类已经存在的功能使用super
		super.showNum();
		// 增加自己特有显示姓名和图片功能
		System.out.println("显示来电姓名");
		System.out.println("显示头像");
	}

}
