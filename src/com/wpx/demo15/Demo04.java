package com.wpx.demo15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 对象的输入输出流 : 对象的输入输出流 主要的作用是用于写对象的信息与读取对象的信息。 对象信息一旦写到文件上那么对象的信息就可以做到持久化了
 
 对象的输出流： ObjectOutputStream .
对象的输入流: ObjectInputStream 
 
 ObjectOutputStream的使用步骤：
 
 对象输入输出流要注意的细节：
 	1. 如果对象需要被写出到文件上，那么对象所属的类必须要实现Serializable接口。 Serializable接口没有任何的方法，是一个标识接口而已。
 	2. 对象的反序列化创建对象的时候并不会调用到构造方法的、
 	3. serialVersionUID 是用于记录class文件的版本信息的，serialVersionUID
 	这个数字是通过一个类的类名、成员、包名、工程名算出的一个数字。
 	4. 使用ObjectInputStream反序列化的时候，ObjeectInputStream会先读取文件中的serialVersionUID，
 	然后与本地的class文件的serialVersionUID
 	进行对比，如果这两个id不一致，那么反序列化就失败了。
 	5. 如果序列化与反序列化的时候可能会修改类的成员，那么最好一开始就给这个类指定一个serialVersionUID，
 	如果一类已经指定的serialVersionUID，然后
 	在序列化与反序列化的时候，jvm都不会再自己算这个 class的serialVersionUID了。
 	6. 如果一个对象某个数据不想被序列化到硬盘上，可以使用关键字transient修饰。
 	7. 如果一个类维护了另外一个类的引用，那么另外一个类也需要实现Serializable接口。
 * @author wangpx
 */
@SuppressWarnings("all")
class Person implements Serializable{
	int age;
	String  name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class Demo04 {

	public static void main(String[] args) throws Exception {
		writeObj();
		readObj();
	}
	//对象的序列化。
	public static void writeObj() throws IOException{
		//找到文件
		File file=new File("D:/demo04.java");
		//建立输出流管道
		FileOutputStream os=new FileOutputStream(file);
		//Person person=new Person(21, "wangpx");
		Student student =new Student(1, "wpx01");
		//建立对象的输出流对象
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
		//把对象写出
		//objectOutputStream.writeObject(person);
		objectOutputStream.writeObject(student);
		//关闭资源
		os.close();
	}
	//对象的反序列化。
	public static void readObj() throws Exception{
		//找到文件
		File file=new File("D:/demo04.java");
		//建立输入流管道
		FileInputStream in=new FileInputStream(file);
		//建立对象的输入流对象
		ObjectInputStream objectInputStream = new  ObjectInputStream(in); 
		////读取对象信息
		Student student = (Student) objectInputStream.readObject();
		System.out.println(student);
		objectInputStream.close();
		
	}
}
