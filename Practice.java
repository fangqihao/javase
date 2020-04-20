class Practice {
	public static void main(String[] args) {
		int a = 7 * 24	* 60 * 60 * 1000;//7天的毫秒值
		System.out.println(a);
		long b = 30 * 24 * 60 * 60 * 1000L;//30天的毫秒值
		System.out.println(b);	
		System.out.println(1.234567);//验证小数字面量是double类型
		//int[] lengthArr = new int[3];
		//final int lengthArr = 4;会报错，已经变量了lengthArr
		//int[] lengthArr = new int[1.234];会报错，不兼容的类型
		//System.out.println(lengthArr.length);
		String[][] c = new String[3][];
		c[0] = new String[]{"你","我","他"};
		c[1] = new String[]{"金","木","水","火","土"};
		c[2] = new String[]{"天","地"};
		System.out.println(c[0][0]+c[0][1]+c[0][2]+"\n"+c[1][0]+c[1][1]+c[1][2]+c[1][3]+c[1][4]+"\n"+c[2][0]+c[2][1]);
	}
}