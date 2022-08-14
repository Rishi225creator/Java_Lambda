package thread;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread thr1=new MyThread();
		Thread thr2=new Thread(thr1);
		thr2.start();
		MyThr thr3=new MyThr();
		thr3.start();
	}

}
