import java.util.concurrent.*; 
import java.util.Scanner;
public class ThreadDemo{
	public static void main(String[] args){
		NewThread nt1 = new NewThread();
		NewThreadTwo ntt1 = new NewThreadTwo();
		NewThreadOne nto1 = new NewThreadOne();


		nt1.start();
		nto1.start();
		ntt1.start();
		// ExecutorService pool = Executors.newFixedThreadPool(2); 
		// pool.execute(nt1); 
		// pool.execute(ntt1); 
		// pool.execute(nto1);  
		// pool.shutdown();

		while(true){
			try{
				Thread.sleep(1000);
				System.out.println("Hello");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

class NewThread extends Thread{
	@Override
		public void run(){
			while(true){
				try{
					sleep(1000);
					System.out.println("From THread 1");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
}

class NewThreadOne extends Thread{
	@Override
		public void run(){
			while(true){
				try{
					sleep(1000);
					System.out.println("From THread 3");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
}

class NewThreadTwo extends Thread{
	@Override
		public void run(){
			while(true){
				try{
					sleep(1000);
					System.out.println("From THread 2");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
}