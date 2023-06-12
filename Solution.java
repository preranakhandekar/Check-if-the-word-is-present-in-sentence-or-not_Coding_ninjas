import java.util.* ;
import java.io.*; 

public class Solution 
{

	public static boolean findWord(String s, String w) 
	{
		int i=0,count=0;
		int n=s.length()-1;
		while(i<=n) {
			while(i<=n && s.charAt(i)==' '){
				if(check(s.substring(count,i),w)){
					return true;
				}
				count=i+1;
				i++;
			}
			if(i==n){
				if(check(s.substring(count,i+1),w)){
					return true;
				}
			}
			i++;
		}
		return false;
	}
	public static boolean check(String s,String w){
		if(s.length()!=w.length()){
			return false;
		}
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=w.charAt(i)){
				return false;
			}
		}
		return true;
	}

}
