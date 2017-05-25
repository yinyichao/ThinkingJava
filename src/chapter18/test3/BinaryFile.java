package chapter18.test3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 读取二进制文件
 * @author yins
 *
 */
public class BinaryFile {
	public static byte[] read(File bFile) throws IOException{
		BufferedInputStream bf = new BufferedInputStream(new FileInputStream(bFile));
		try{
			byte[] data = new byte[bf.available()];
			bf.read(data);
			return data;
		}finally{
			bf.close();
		}
	}
	public static byte[] read(String bFile) throws IOException{
		return read(new File(bFile).getAbsoluteFile());
	}
}
