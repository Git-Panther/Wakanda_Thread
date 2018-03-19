package kh.thread.test;

public class NumberOutputThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int index = 1; index <= 20; index++) {
			System.out.println(index);
		}
	}

}
