
public class sudarshan
	{
		public static void main(String[]args)
{
			sudarshan.printvowels("HeLLO sudarshan");
}


  static void printvowels(String s)
  {
  String vowels = "aeiouAEIOU";
  
  for(int i=0; i < s.length();i++)
  {
	  if (vowels.indexOf(s.charAt(i))!=-1)
	  {
		  System.out.println(s.charAt(i));
	  }
  }
  }}
  

