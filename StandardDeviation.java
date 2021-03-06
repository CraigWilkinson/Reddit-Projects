public class StandardDeviation {

/*
 * "Standard Deviation" 
 * A program that takes a list of input arguments and finds the standard Deviation.
 * http://www.reddit.com/r/dailyprogrammer/comments/35l5eo/20150511_challenge_214_easy_calculating_the/
 * 
 * 
 * 
 */
	
	public static void main(String[] args){
		int Variance;
		int Sumdifferencesquared = 0;
		int[] argsArray = new int[args.length];
		int argsIndex = 0;
		for (String s: args){
			int tempInt = Integer.parseInt(s);
			argsArray[argsIndex] = tempInt;
			argsIndex++;
		}
		int meanCount = 0;
		for (int i: argsArray){
			meanCount =  meanCount + i;
		}
		int Mean = meanCount/(argsArray.length);
		argsIndex = 0;
		for (int i: argsArray){
			int difference = i - Mean;
			Sumdifferencesquared = Sumdifferencesquared + (difference*difference);
		}

		Variance = Sumdifferencesquared/(argsArray.length);
		double StandardDeviation = Math.sqrt(Variance);
		System.out.println(StandardDeviation);
	}
}
