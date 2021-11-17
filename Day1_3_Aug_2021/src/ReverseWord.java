import java.util.*;
public class ReverseWord {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String sentence=s.nextLine();
		sentence.split(" ");
        
        String reverseString = "";
         
        for (int i = 0; i < sentence.length(); i++) 
        {
            String word = toCharArray(sentence[i]);
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
	}

}
}