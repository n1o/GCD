package sk.marek.barak;


public class VisualDNA {

	public int GCD(int first, int second){
		int max = Math.max(first, second);
		int min = Math.min(first, second);
		int tmp = 0;
		
		while (min != 0){
			tmp = max % min;
			max = min;
			min = tmp;	
		}
		return max;
	}

}
