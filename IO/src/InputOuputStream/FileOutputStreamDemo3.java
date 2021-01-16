package InputOuputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *   IO流的异常处理
 *   try catch finally
 *   
 *   细节:
 *     1. 保证流对象变量,作用域足够
 *     2. catch里面,怎么处理异常
 *         输出异常的信息,目的看到哪里出现了问题
 *         停下程序,从新尝试
 *     3. 如果流对象建立失败了,需要关闭资源吗
 *         new 对象的时候,失败了,没有占用系统资源
 *         释放资源的时候,对流对象判断null
 *         变量不是null,对象建立成功,需要关闭资源
 */
/*
 *  字节输出流
 *    java.io.OutputStream 所有字节输出流的超类
 *    作用: 从Java程序,写出文件
 *    字节: 这样流每次只操作文件中的1个字节
 *    写任意文件
 *    
 *    方法都是写文入的方法
 *    write(int b) 写入1个字节
 *    write(byte[] b) 写入字节数组
 *    write(byte[] b,int,int)写入字节数组,int 开始写入的索引, int 写几个
 *    close() 方法,关闭流对象,释放与次流相关的资源
 *    
 *    流对象,操作文件的时候, 自己不做,依赖操作系统
 */
public class FileOutputStreamDemo3 {
	public static void main(String[] args) {
		//try 外面声明变量,try 里面建立对象
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("s:\\a.txt");
			fos.write(100);
		}catch(IOException ex){
			System.out.println(ex);
			throw new RuntimeException("文件写入失败,重试");
		}finally{
			try{
				if(fos!=null)
			      fos.close();
			}catch(IOException ex){
				throw new RuntimeException("关闭资源失败");
			}
		}
	}
}
