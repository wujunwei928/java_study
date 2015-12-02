
// String Practic

import java.util.regex.*;	//正则表达式
class StringPractice{
	public static void main(String[] args) {
		String name = "wujunwei";
		System.out.println(name.length());
		System.out.println(name.charAt(6));

		//正则表达式
		String str = "ming tian jiu yao fang jia le , da jia.";
		String reg = "\\b[a-z]{4}\\b";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(str);
		//判断是否匹配到
		boolean b = m.find();
		System.out.println(b);

		System.out.println(m.group());

		while (m.find()) {
			System.out.println(m.group());
			System.out.println(m.start()+"......"+m.end());
		}
	}

	/*
	需求：
	将下列字符串转成：我要学编程.
	
	到底用四种功能中的哪一个呢？或者哪几个呢？
	思路方式：
	1，如果只想知道该字符是否对是错，使用匹配。
	2，想要将已有的字符串变成另一个字符串，替换。
	3，想要按照自定的方式将字符串变成多个字符串。切割。获取规则以外的子串。
	4，想要拿到符合需求的字符串子串，获取。获取符合规则的子串。
	*/
	public static void test_1()
	{
		String str = "我我...我我...我要..要要...要要...学学学....学学...编编编...编程..程.程程...程...程";
		/*
		将已有字符串变成另一个字符串。使用 替换功能。
		1,可以先将 . 去掉。
		2，在将多个重复的内容变成单个内容。
		*/
		str = str.replaceAll("\\.+","");
		System.out.println(str);

		str = str.replaceAll("(.)\\1+","$1");
		
		System.out.println(str);

	}
	/*
	192.68.1.254 102.49.23.013 10.10.10.10 2.2.2.2 8.109.90.30
	将ip地址进行地址段顺序的排序。


	还按照字符串自然顺序，只要让它们每一段都是3位即可。
	1，按照每一段需要的最多的0进行补齐，那么每一段就会至少保证有3位。
	2，将每一段只保留3位。这样，所有的ip地址都是每一段3位。

	*/
	public static void ipSort()
	{
		String ip = "192.68.1.254 102.49.23.013 10.10.10.10 2.2.2.2 8.109.90.30";

		ip = ip.replaceAll("(\\d+)","00$1");
		System.out.println(ip);

		ip = ip.replaceAll("0*(\\d{3})","$1");
		System.out.println(ip);

		String[] arr = ip.split(" ");

		TreeSet<String> ts = new TreeSet<String>();

		for(String s : arr)
		{
			ts.add(s);
		}

		for(String s : ts)
		{
			System.out.println(s.replaceAll("0*(\\d+)","$1"));
		}
	}
}