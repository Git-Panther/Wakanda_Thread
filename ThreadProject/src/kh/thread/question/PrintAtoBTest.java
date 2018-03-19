package kh.thread.question;

public class PrintAtoBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new PrintAtoBRunnable(100, 50)).start();
	}

}
