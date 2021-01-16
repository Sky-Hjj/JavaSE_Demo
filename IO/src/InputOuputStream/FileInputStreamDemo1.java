package InputOuputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 *  FileInputStream读取文件
 *   读取方法  int read(byte[] b) 读取字节数组
 *   数组作用: 缓冲的作用, 提高效率
 *   read返回的int,表示什么含义 读取到多少个有效的字节数
 */
/*
 *   字节输入流
 *     java.io.InputStream 所有字节输入流的超类
 *   作用: 读取任意文件,每次只读取1个字节
 *   读取的方法  read
 *     int  read() 读取1个字节
 *     int  read(byte[] b) 读取一定量的字节,存储到数组中
 */
public class FileInputStreamDemo1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:\\a.txt");
		//创建字节数组
		byte[] b = new byte[1024];
		
		int len = 0 ;
		while( (len = fis.read(b)) !=-1){
			System.out.print(new String(b,0,len));
		}
		fis.close();
	}
}
/*
 * 
		int len = fis.read(b);
		System.out.println(new String(b));//ab
		System.out.println(len);//2
		
		len = fis.read(b);
		System.out.println(new String(b));//cd
		System.out.println(len);//2
		
		len = fis.read(b);
		System.out.println(new String(b));//ed
		System.out.println(len);//1
		
		len = fis.read(b);
		System.out.println(new String(b));//ed
		System.out.println(len);//-1
		*/
