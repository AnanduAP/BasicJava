
public class ObjectAndClass {
public static void main(String args[]){
	Sample s1=new Sample();
	Sample s2=new Sample();
	s1.a=10;
	s1.b=12;
	s2.a=89;
	s2.b=76;
	s1.display();
	s2.display();
	System.out.println("s1 -a:" +s1.a +"s2 -a:" +s2.a +"s1 -b:" +s1.b +"s2 -b:" +s2.b);
}
}
