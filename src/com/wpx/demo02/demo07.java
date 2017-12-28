package com.wpx.demo02;
/**
 * 逻辑运算符 ：逻辑运算符的作用是用于连接布尔表达式的。 

	& （与,并且）
规律： 只有左右变量同时 为true，那么结果才是true，否则就为false。

	|  (或,或者)

规律： 只要两边的布尔表达式有一边为true，那么结果就为true，只有两边同时为false 的时候，结果才是false.

	^  (异或)

规律： 只要两边的布尔表达式 结果不一致，那么结果就为true，如果左右两边 的布尔表达式一致，那么就为false.

	！ (非)

--------------------
	&& (短路与\双与)

短路与和单与符号的相同与不同点：
	
	相同点： 短路与和单与运算 的结果是一样的。

	不同点： 使用短路与的时候，如果左边的布尔表达式为false，则不会在运算右边的布尔表达式，从而提高了
	效率。使用单与的时候，即使发现左边的布尔表达式为false，还是会运算右边的布尔表达式的。


只有左边的布尔表达式为false时，双与的效率才要高于单与的.


	|| (短路或\双或)


短路或与单或的相同点与不同点：
	
	相同点：运算的结果是一致 的。

	不同点：使用短路或的时候，当发现左边的布尔表达式为true时，则不会运算右边的布尔表达式。
	使用单或的时候 发现左边的布尔表达式为true，还是会运算右边布尔表达式。
 * @author wangpx
 */
public class demo07 {

	public static void main(String[] args) {
	
		System.out.println(false&true);
		System.out.println(false&&true);
		
		System.out.println(false|true);
		System.out.println(false||true);
		
		System.out.println(false^true);
		System.out.println(true^true);
}
}
