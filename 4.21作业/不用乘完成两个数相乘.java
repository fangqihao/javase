class Mul {
	public static void main(String[] args) {
		System.out.println(multiply(3,4));
	}

	static int multiply(int n1, int n2){
		int result = 0;
		for (int i = 1;i <= n2 ;i++) {
			result = result + n1;
		}
		return result;
	}
}
