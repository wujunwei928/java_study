
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
}