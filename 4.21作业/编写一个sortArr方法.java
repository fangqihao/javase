class Sortarr {
	public static void main(String[] args) {
			int[] arr = new int[]{13,26,-3,4,54,26,37,18,69,-10};
			print(arr);
			System.out.println();
	}

	static void print(int arr[]){
		for (int i = 0 ;i < arr.length ; i++) {
			System.out.println(""+"["+i+"]"+"="+arr[i]);
				if ((i + 1) % 5 == 0) {
					System.out.println();
				}
		}
	}

	static void sort(int arr[], boolean isAsc) {
		int temp = 0;
		for (int i = 0;i < arr.length - 1 ;i++){
			int t = i;
			if (isAsc == true) {
				for (int j = i + 1;j < arr.length ;j++ ) {
					if (arr[t] > arr[i]) {
						t = j;
						
					}
					
				}
				
			}
			else{
				for (int j = i + 1;j < arr.length ;j++ ) {
					if (arr[t] < arr[j]) {
						t = j;
						
					}
					
				}
			}
			temp = arr[i];
      		arr[i] = arr[t];
      		arr[t] = temp;
		}
	}

	static void sort(int arr[]) {
		int temp = 0;
		for (int i = 0;i < arr.length - 1 ;i++ ) {
			int t = i;
			for (int j = i + 1;j < arr.length ;j++ ) {
				if (arr[t] > arr[j]) {
					t = j;
					
				}
				
			}
			temp = arr[i];
      		arr[i] = arr[t];
      		arr[t] = temp;
		}
	}
	
}

