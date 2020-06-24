
public class HEllonRunnable {
	public static void main (String ar[]){
	SampleThreadRunnableInt st=new SampleThreadRunnableInt();
			Thread t=new Thread(st);
			t.start();
	SampleThreadRunnableInt st1=new SampleThreadRunnableInt();
			Thread t1=new Thread(st1);
			t1.start();
	}
}

