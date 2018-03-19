package kh.thread.question;

public class PrintAtoBRunnable implements Runnable {

	private int num1, num2;
	
	public PrintAtoBRunnable(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(num1 > num2) {
			int temp = num1;
			num1 =  num2;
			num2 = temp;
		}
		
		for(int index = num1; index <= num2; index++)
			System.out.println(index);
	}

}
