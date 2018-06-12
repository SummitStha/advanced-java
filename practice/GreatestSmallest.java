public class GreatestSmallest{
	void check(int []a){
		int maxValue = a[0];
		int minValue = a[0];
    	for (int i = 1; i < a.length; i++) {
        	if (a[i] > maxValue) {
            	maxValue = a[i];
        	}
    	}
    	return maxValue;
	}
	public static void main(String[] args){
		int a[]= {1,2,3,4,5};
		check(a);
	}
}



