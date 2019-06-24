
public class Remove_A_First2char_From_String {

	public String removeAFirstTwo(String s)
	{
		int len=s.length();
		String f="",l="";
		if(s.length()<=1)
		{
			if(s.charAt(0)=='A')
			{
				return "";
			}
			else
			{
				return s;
			}
		}
		else if(s.length()>=2)
		{
			f=s.substring(0,2);
			if(s.length()>=2)
			{
				l=s.substring(2,len);
			}
		
			
			String k=f.replace("A", "");
			
			return k+l+"";
			
		
		}
		return s;
		
	}
	
}
