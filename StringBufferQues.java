package Questions;

import java.util.Scanner;

public class StringBufferQues {

	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		System.out.println("Entered String:");
		int count =1;
		StringBuffer sb= new StringBuffer();
		int length = str.length();
		for(int i=0;i<length;i++)
		{
			//if i equals to the end element of the string then append them and break the loop
			if(i==length-1) 
			{
			sb.append(str.charAt(i)+""+count);
			break;
			}
			//if i equals to the i+ element then increase the count and move to the next element
			if(str.charAt(i)==str.charAt(i+1))
			{
			count++;	
			}
			else
			{
				sb.append(str.charAt(i)+""+count);
				count=1;
			}
			
		}
		System.out.println(sb.toString());

	}

}
