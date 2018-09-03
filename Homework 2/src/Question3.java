public class Question3 {
	
	public Question3(){}	
	
    public int getMirrorCount(int[] numbers){
    	int max = 0;
    	int n = 0;
    	for(int i = 0; i < numbers.length; i++) {
    		if(numbers[i] == numbers[numbers.length-1-i]) {
    			n++;
    		}
    		else {
    			if(n > max) {
    				max = n;
    			}
    			n = 0;
    		}
    		if(numbers.length - 1 == i) {
    			if(n > max) {
    				max = n;
    			}
    		}
    	}
		return max;	
	}
}
