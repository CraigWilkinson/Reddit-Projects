
public class RomanNumerals {
	/*
	 * "Roman Numeral Conversion" 
	 * This Program takes in a string as an argument and then converts it to a Number from roman numerals
	 * http://www.reddit.com/r/dailyprogrammer/comments/2ms946/20141119_challenge_189_intermediate_roman_numeral/
	 * 
	 * 
	 */
	
	public static void main(String[] args){
		int currentCount = 0;
		int indexCount = 1;
		String romanNumeral = args[0];
		String[] arrayNumeral = romanNumeral.split("(?!^)");
		for (int i = 0;i < arrayNumeral.length;i++){
			if (arrayNumeral[i].equals("M")){
				currentCount = currentCount + 1000;
			}else if(arrayNumeral[i].equals("D")){
				currentCount = currentCount + 500;
			}else if(arrayNumeral[i].equals("C")){
				if(indexCount == arrayNumeral.length){
					currentCount = currentCount + 100; //This is to make sure if "C" is the last value that it doesn't go to the next else if.
				}else if (arrayNumeral[i+1].equals("M") || arrayNumeral[i+1].equals("D")){
					currentCount = currentCount - 100; //Minus 100 because arrayNumeral i+1 will still be counted so minus 100.
				}else{
					currentCount = currentCount + 100;
				}
			}else if(arrayNumeral[i].equals("L")){
				currentCount = currentCount + 50;
			}else if(arrayNumeral[i].equals("X")){
				if(indexCount == arrayNumeral.length){
					currentCount = currentCount + 10; //This is to make sure if "X" is the last value that it doesn't go to the next else if.
				}else if (arrayNumeral[i+1].equals("L") || arrayNumeral[i+1].equals("C")){
					currentCount = currentCount - 10; //Minus 10 because arrayNumeral i+1 will still be counted so minus 10.
				}else{
					currentCount = currentCount + 10;
				}
			}else if(arrayNumeral[i].equals("V")){
				currentCount = currentCount + 5;
			}else if(arrayNumeral[i].equals("I")){
				if(indexCount == arrayNumeral.length){
					currentCount = currentCount + 1; //This is to make sure if "I" is the last value that it doesn't go to the next else if.
				}else if (arrayNumeral[i+1].equals("V") || arrayNumeral[i+1].equals("X")){
					currentCount = currentCount - 1; //Minus 100 because arrayNumeral i+1 will still be counted so minus 100.
				}else{
					currentCount = currentCount + 1;
				}
			}else{
				System.out.println(arrayNumeral[i] + " is not a valid letter in Roman Numerals");
			}
			indexCount++;
		}
		System.out.println(currentCount);
	}
}

