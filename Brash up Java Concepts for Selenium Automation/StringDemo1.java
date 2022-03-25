
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Raju";
		String s2=new String("Dipankar");
		String s3="Rahul Shetty Academy";
		String[] split1=s3.split(" ");
		System.out.println(split1[1]);
		String[] split2=s3.split("Shetty");
		System.out.println(split2[0]);
		System.out.println(split2[1].trim());
		for(int i=0;i<s3.length();i++)
		{
			System.out.print(s3.charAt(i)+" ");
		}
		
		for(int i=s3.length()-1;i>=0;i--)
		{
			System.out.print(s3.charAt(i)+" ");
		}
		

	}

}
