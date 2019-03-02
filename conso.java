import java.util.Scanner;
class conso {
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		String s1;
		int flag=0;
		int counta=0,counte=0,counti=0,counto=0,countu=0;
		System.out.println("Enter any string: ");
		s1=s.next();
		int a=s1.length();
		char b[]=s1.toCharArray();
		char z[]=new char[b.length];
		int i=0;
		for( i=0;i<b.length;i++)
		{
		if(b[i]=='a')
		{
		 counta++;
		}
		else if(b[i]=='e')
		{
		counte++;
		}
		else if(b[i]=='i')
		{
		counti++;
		}
		else if(b[i]=='o')
		{
		counto++;
		}
		else if(b[i]=='u')
		{
		countu++;
		}
		else
		{
		z[flag]=b[i];
		flag++;
		}
		}
		System.out.println("Occurence of Vowel a: "+counta);
		System.out.println("Occurence of Vowel e: "+counte);
		System.out.println("Occurence of Vowel i: "+counti);
		System.out.println("Occurence of Vowel o: "+counto);
		System.out.println("Occurence of Vowel u: "+countu);
		for(i=0;i<flag;i++)
		System.out.println("Consonent: "+z[i]);
		}
}
	    
	
	