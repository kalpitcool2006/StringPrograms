import java.util.Arrays;

public class AnagramDeleteCharacter {

	public static int Anagram(String str1,String str2)
	{
		int c=0;
	
	// String a="cde";
		//String b="abc";
	 
	 int count1 []= new int [256];
	 int count2 []= new int [256];
		for(int i=0;i<str1.length();i++)
		{
			count1[str1.charAt(i)]++;
			
		}
			
			for(int j=0;j<str2.length();j++)
			{
				count2[str2.charAt(j)]++;
			
			}
		int r=0;
			for(int i = 0;i<count1.length;i++)
			{
				r+=Math.abs(count1[i]-count2[i]);
			}
		
		return r;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="cde";
		String b="abc";
		
		//System.out.println(ch1.length-1);
		int r=Anagram(a,b);
System.out.println(r);
	}

}
