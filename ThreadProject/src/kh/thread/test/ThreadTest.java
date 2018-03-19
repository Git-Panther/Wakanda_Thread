package kh.thread.test;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOutputThread not = new NumberOutputThread();
		Thread nor = new Thread(new NumberOutputRunnable());
		not.start(); 
		nor.start();
		// 실행 순서는 지 맘
		
		for(int index = 100; index <= 120; index++)
			System.out.println(index);
	}

}
