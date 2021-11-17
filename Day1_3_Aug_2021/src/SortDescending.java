
public class SortDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={12,45,98,8,100};
		int temp=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
			if(arr[i]<arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
