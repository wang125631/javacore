package com.wpx.demo15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 *  Properties（配置文件类）: 主要用于生产配置文件与读取配置文件的信息。
	Properties要注意的细节：
	1. 如果配置文件的信息一旦使用了中文，那么在使用store方法生成配置文件的时候只能使用字符流解决，如果使用字节流生成配置文件的话，
	默认使用的是iso8859-1码表进行编码存储，这时候会出现乱码。
	2. 如果Properties中的内容发生了变化，一定要重新使用Properties生成配置文件，否则配置文件信息不会发生变化。
	
	
 * @author wangpx
 */
public class Demo05 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		readProperties();
	}
	//新建配置文件
	public static void writeProperties() throws FileNotFoundException, IOException {
		//创建Properties对象
		Properties p=new Properties();
		p.setProperty("key1", "value1");
		p.setProperty("key2", "value2");
		p.setProperty("key3", "value3");
		
		p.store(new FileOutputStream(new File("D:/demo05")), "about properties");
	}
	//读取配置文件信息 
	public static void readProperties() throws FileNotFoundException, IOException {
		//创建Properties对象
		Properties properties = new Properties();
		//加载配置文件信息到Properties中
		properties.load(new FileReader("D:/demo05.properties"));
		//遍历
		Set<Entry<Object, Object>> entrys = properties.entrySet();
		for(Entry<Object, Object> entry  :entrys){
			System.out.println("键："+ entry.getKey() +" 值："+ entry.getValue());
		}
		//修改wpx
		//把修改后的Properties再生成一个配置文件
		properties.setProperty("key1", "value123");
		properties.store(new FileWriter("D:/demo05.properties"), "");
	}
	
}
