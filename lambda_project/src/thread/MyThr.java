package thread;

public class MyThr extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("2x"+i+"="+2*i);
		}
	}
}
