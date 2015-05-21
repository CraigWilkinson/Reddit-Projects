import java.util.Arrays;
import java.util.List;

public class NumberFilter {
	
	public static void main(String[] args){
		int[] argsArray = new int[args.length];
		int[] CullArray = new int[args.length];
		int argsIndex = 0;
		int TempintTwo = 0;
		int CountTwo = 0;
		int CountFour = 0;
		int Tempint;
		for (String s: args){
			Tempint = Integer.parseInt(s);
			argsArray[argsIndex] = Tempint;
			argsIndex++;
		}
		for (int i: argsArray){
			TempintTwo = 0;
			int CountThree = argsArray.length;
			while (CountThree > 0){
				if (i == CullArray[CountThree-1]){
					TempintTwo = 1;
					}
				CountThree--;
			}
			if (TempintTwo == 0){
				CullArray[CountTwo] = i;
				CountTwo++;
			}
		
		}
		while (CountFour < CountTwo){
			System.out.print(CullArray[CountFour] + " ");
			CountFour++;
			
		}
	}
	}

