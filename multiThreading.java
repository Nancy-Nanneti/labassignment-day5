package labassignmentday4;


class mythread implements Runnable{
	Thread t;
	public void run() {
		for(int i=0;i<100;i++) {
			//System.out.println("hai");
			System.out.println("["+t.currentThread().getName()+": "+i+"]");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class multithread {
  public static void main(String args[]) {
		Thread t1=new Thread(new mythread());
 		Thread t2=new Thread(new mythread());
 		Thread t3=new Thread(new mythread());
	  t1.start();
	  t2.start();
	  t3.start();
  }
}
