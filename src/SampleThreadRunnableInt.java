
public class SampleThreadRunnableInt implements Runnable {
@Override
public void run() {
	for (int i = 0; i < 3; i++) {
		System.out.println("Thread count"+i);
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();	// TODO Auto-generated method stub
		}
}
}
}
