
public class MyThread implements Runnable {
	
	public void run() {
		int a=0;
		while(true) {
			System.out.println(a);
			a++;
			if(a==20)
				break;
		}
		
	}
	
	public static void main(String[] args) 
	
	{
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		t1.start();
		t2.start();

	}
}

