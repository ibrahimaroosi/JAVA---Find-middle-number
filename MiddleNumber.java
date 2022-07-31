
public class MiddleNumber {

	public static void main(String[] args) {
		
		//Find middle number
		
		int count = 0;
		int min = 1, max = 10; //Range taken as 1 to 10
		for (int i=min; i<=max; i++ ) {
			count++;
		}
		if (count%2!=0) {
			while(++min < --max) {
				
			}
			System.out.println("Mid value is " + min);
		}else {
			while(++min < --max) {
				
			}
			System.out.println("Mid values are " + max + ", " + min);
		}
	}

}
