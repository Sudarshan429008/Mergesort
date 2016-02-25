
public class digits

{
	public static void main(String[]args)
{
		digits.printdigits("SudarshanF00429008");
}


static void printdigits(String s)
{
String digits = "0123456789";

for(int i=0; i < s.length();i++)
{
  if (digits.indexOf(s.charAt(i))!=-1)
  {
	  System.out.println(s.charAt(i));
  }
}
}}
