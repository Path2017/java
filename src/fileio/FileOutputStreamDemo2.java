package fileio;

import java.io.File;
import java.io.FileOutputStream;
//直接new FileOutputStream(file)这样创建对象，写入数据，会覆盖原有的文件，那么我们想在原有的文件中续写内容怎么办呢？
//继续查阅FileOutputStream的API。发现在FileOutputStream的构造函数中，可以接受一个boolean类型的值，如果值true，就会在文件末位继续添加。

public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Pathliu\\Desktop\\MyWeb_2017\\gitHub\\java\\src\\output1.txt");
		FileOutputStream fos = new FileOutputStream(file, true);
		String str = "\r\n" + "续写";
		fos.write(str.getBytes());
		fos.close();
	}

}
