
public class MiddleValue {

	public static void main(String[] args) {
		
		//Find middle value
		
		int count = 0;
		int min = 1, max = 10; //Range taken as 1 to 10
		for (int i=min; i<=max; i++ ) {
			count++;
		}
		if (count%2!=0) { // If the range has single middle value
			while(++min < --max) {
				
			}
			System.out.println("Middle value is " + min);
		}else { // If the range has two middle values
			while(++min < --max) {
				
			}
			System.out.println("Middle values are " + max + ", " + min);
		}
	}

}
