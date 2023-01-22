class CMDSort{
	public static void sortArray(int arr[]){
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args){
		int arr[] = new int[args.length];
		System.out.println("Original Elements: ");
		for(int i=0; i<args.length; i++){
			arr[i] = Integer.parseInt(args[i]);
			System.out.print(args[i]+" ");
		}
		System.out.println();
		sortArray(arr);
		
		System.out.println("Sorted Elements: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
