import java.util.Arrays;
public class ProblemSolving {

	//RETURN PRIME NUMBERS
	public static int[] primeNumbers(int min, int max) {
		int i,j,flag,k=0;
		int prime[] = new int[max-min+1];
		for(i=min;i<=max;i++) {
			flag = 0;
			for(j=2;j<=i/2;j++) {
				if(i%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0)
				prime[k++] = i;
		}
		return Arrays.copyOfRange(prime,0,k);
	}

	//ARMSTRONG NUMBER
	public static boolean isArmstrong(int num) {
		int armstrong=0, element = num;
		
		while(element>0) {
			armstrong+=(int)Math.pow((element%10), 3);
			element/=10;
		}
		return (armstrong==num);
	}
	//PALINDROME NUMBER
	public static boolean isPalindrome(int num) {
		int palindrome=0, element =num;
		while(element>0) {
			palindrome= (palindrome*10)+ (element%10);
			element/=10;
		}
		return (palindrome==num);
	}
	//PERFECT NUMBER
	public static boolean isPerfect(int num) {
		int perfect=1, i;
		for(i=2;i<=num/2;i++)
			if(num%i==0)
				perfect+=i;
		return (perfect==num);
	}
	
	public static void identifyTypeOfTheNumber(int num) {
		boolean armstrong = isArmstrong(num);
		boolean palindrome = isPalindrome(num);
		boolean perfect = isPerfect(num);
		
		System.out.println("The given number is a ");
		
		if(armstrong || palindrome || perfect) {
			if(armstrong) System.out.println("Armstrong number");
			if(palindrome) System.out.println("Palindrome number");
			if(perfect) System.out.println("Perfect number");
		}
		else 
			System.out.println("Normal number");
	}
	
	
	public static void main(String[] args) {
		//PRIME NUMBERS
		int start = 1, end=100;
		int ansArray[] = primeNumbers(start,end);
		for(int ele: ansArray) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		//IDENTIFY TYPE OF NUMBER
		int num = 6;
		identifyTypeOfTheNumber(num);
		
	}

}
