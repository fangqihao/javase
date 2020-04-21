//请思考验证当float类型变量中保存了超出了int所能表示的范围的数字，将这个变量强制转换为int数据类型后，int数据类型变量中保存的值是多少
//编写示例证明||会出现短路而|是不会短路的

class practice{
	public static void main(String[] args) {
	float a = 3.1415e12f;
	int b = (int)a;
	System.out.println(b);

	int c = 1;// 会出现短路的情况
	boolean or = true || (++c > 1);
	System.out.println(or); // true
	System.out.println(c); // 1

	int d = 1;// 不会出现短路的情况
	boolean orr = true | (++d > 1);
	System.out.println(or); // true
	System.out.println(d); // 2
	}
}
	

