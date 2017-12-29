package com.wpx.demo09;
/**
 * 如果需要频繁修改字符串 的内容，建议使用字符串缓冲 类（StringBuffer）。

StringBuffer 其实就是一个存储字符 的容器。

	StringBuffer 底层是依赖了一个字符数组才能存储字符数据 的，该字符串数组默认 的初始容量是16， 如果字符数组的长度不够使用 ，自动增长1倍。

容器的具备 的行为
	增加
	删除
	修改
	查看
	判断 

 * @author wangpx
 */
public class demo03 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		for(int i='a';i<'z';i++) {
			sb.append(i);
			//System.out.println(sb.hashCode());
		}
		System.out.println(sb);
}
}
