package MutliThreading;
class Threading extends Thread { 
	Thread t;
	Threading(){
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		for (int D = 1; D < 8; D++) {
			try {
				System.out.println(D);
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("End of Thread 1");
	}
}


class AnotherThreading extends Thread { 
	Thread t;
	AnotherThreading(){
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		for (char D = 'A'; D < 'O' ; D++) {
			try {
				System.out.println(D);
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("End of Thread 2");
	}
}

public abstract class MultiThread1 implements Runnable  {
	@SuppressWarnings({ "removal" })
	public static void main(String[] args) {
		
		Threading TT1 = new Threading();
		AnotherThreading TT2 = new AnotherThreading();
		try {
			Thread.sleep(3000);//Just Waiting 3 Seconds
			
			System.out.println("Suspending Thread 1 for 3Sec");
			System.out.println("...." + "\n" + "....");
			TT1.t.suspend();
			Thread.sleep(3000);
			
			System.out.println("Suspending Thread 2 for 3Sec");
			System.out.println("...." + "\n" + "....");
			TT2.t.suspend();
			Thread.sleep(3000);
			
			System.out.println("Resuming Both");
			TT1.t.resume();
			TT2.t.resume();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
