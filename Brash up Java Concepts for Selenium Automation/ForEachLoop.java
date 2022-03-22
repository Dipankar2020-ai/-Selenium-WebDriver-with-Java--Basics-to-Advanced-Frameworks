public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int s:arr)
			System.out.print(s+" ");
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" is multiple of 2");
				
			}
			else
			{
				System.out.println(arr[i]+" is not multiple of 2");
			}
		}
	}
}
