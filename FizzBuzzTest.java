//Youheng
class FizzBuzzTest {
  //FizzBuzz test class
  //A program to test the functionality of our FizzBuzz class
	public static void fizzNumberTest() {
		//n=0
		if (FizzBuzz.fizzNumber(0).equals("fizzbuzz")){
			System.out.println("Success; 0 => fizzbuzz");
		}
		else {
			System.out.println("Test failed for n=0!");
		}

		//n=1
		if (FizzBuzz.fizzNumber(1).equals("1")){
			System.out.println("Success; 1 => 1");
		}
		else {
			System.out.println("Test failed for n=1!");
		}

		//n=3
		//n=5
		//n=15
		//n="string"
		//n="-9"
		//n="-15"
		//n="-10"
	}
	public static void fizzListTest(){
		//start n=1 end=5
		//start n=12 end=16
		//start n=-2 end=2
		//start n=10 end=5

	}
	
	public static void main (String [] arg){
		//Program Logic Goes Here
		fizzNumberTest();
	}
}