
public class SampleThread extends Thread  {
@Override
public void run() {
	// TODO Auto-generated method stub
	super.run();
	for (int i = 0; i < 3; i++) {
		System.out.println("Thread count"+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();// TODO: handle exception
		}
		
	}
	
}
}
