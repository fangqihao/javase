class Min {
	public static void main(String[] args) {
		convert(3456789L);
	}

	static void convert(long minute) {
		long year = (minute/24L/60L)/365L;
		long day = (minute/24L/60L)%365L;
		System.out.printf("%d分钟是%d年%d天",(int)minute,(int)year,(int)day);
	}
}