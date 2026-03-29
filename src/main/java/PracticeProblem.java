public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String evenOrOdd(int num){
		if(num==0){
			return "Zero";}
		if (num%2==0){
        return "Even";
		}
		if(num%2!=0){
			return"Odd";}
		else{
			return "";
		}
		
		}

	public static String positiveOrNegative(int num){
		if(num>0){
			return "Positive";
		}
		if(num<0){
			return"Negative";
		}
       else{
		return "Zero";
	   }
	}
	public static String pluralize(String word){
		 word= word.toLowerCase();
		if(word.endsWith("ey")){
			return"eys";}
		if(word.endsWith("y")){
			return"ies";
		}
		
		if(word.endsWith("ife")){
			return"ives";
		}
		else{
			return"s";
		}

	}
		
	}

	


