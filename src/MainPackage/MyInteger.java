package MainPackage;

/*Lucia Malvoni
 * PS2
 * I started with an int data field named value that stores the int value. */

public class MyInteger {
	private int value;

	/* I made a get method that returns the int value. */
	public int getValue(){
		return value;
	}
	private void setValue(int value){
		this.value=value;
	}

	/* I made a constructor that creates MyInteger for the specified int value. */ 
	public MyInteger(int value){
		setValue(value);
	}

	/* I created methods named isEven() and isOdd() that return true if the method is even
	 * or odd, respectively. I made them calculate whether there is a remainder to 
	 * determine even or odd. */
	public boolean isEven(){
		if (this.getValue() % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}


	public boolean isOdd(){
		if (this.getValue() % 2 != 0){
			return true;
		}
		else{
			return false;
		}
	}

	/* I created a method isPrime() that used a for loop to determine if the 
	 * number is prime. I also used the concept of having a remainder since 
	 * prime numbers are not divisible by any factors other than 1 and itself. */ 
	public boolean isPrime(){
		int i = 0;
		for(i = 1; i <= this.getValue() / 2; i++){
			if(this.getValue() % i == 0)
				return true;
		}
		return false;
	}

	/* I created isEven(int) method that returns true when the number is even. */
	public static boolean isEven(int value){
		if (value % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}

	/* I created isEven(MyInteger) method. */
	public static boolean isEven(MyInteger myInt){
		if (myInt.getValue() % 2 == 0){
			return true;
		}
		else{
			return false;
		}

	}

	/* I created isOdd(int) method that returns true when the number is odd. */
	public static boolean isOdd(int value){
		if (value % 2 != 0){
			return true;
		}
		else{
			return false;
		}
	}

	/* I created isOdd(MyInteger) method. */
	public static boolean isOdd(MyInteger myInt){
		if (myInt.getValue() % 2 != 0){
			return true;
		}
		else{
			return false;
		}

	}

	/* I created isPrime(int) method that returns true when the number is prime. */
	public static boolean isPrime(int value){
		return isPrime(value);
	}

	/* I created isPrime(MyInteger) method. */
	public static boolean isPrime(MyInteger myInt){
		return myInt.isPrime();
	}

	/* I created two methods, equals(int) and equals(MyInteger). */
	public boolean equals(int intValue){
		return value == intValue;
	}
	public boolean equals(MyInteger myInt){
		return equals(myInt.getValue());
	}

	/* I created a parseInt(char[]) that converts an array into an int value. */
	public static int parseInt(char[] a) {
		return parseInt(new String(a));

	}

	/* I created a parseInt(String s) that converts a string into an int value. */
	public static int parseInt(String s){
		return Integer.parseInt(s);
	}
}