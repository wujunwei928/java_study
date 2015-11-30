
// Datetime Practice

import java.util.*;
import java.text.*;
class DatetimePractice{
	public static void main(String[] args) {
		//实例化时间对象
		Date d = new Date();
		System.out.println(d);

		//打印标准时间 2015-11-30 11:11:11
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = sdf.format(d);
		System.out.println(time);

		//获取当前时间戳
		long l = System.currentTimeMillis();
		System.out.println(l);

		//通过时间戳实例化时间对象
		Date d1 = new Date(l);
		System.out.println(d1);

	}
}