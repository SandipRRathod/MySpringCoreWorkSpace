package sandip12.myfproject.constructor;

public class Addition {
private int a;
private int b;
public Addition(int a, int b) {
	super();
	System.out.println("int construtor");
	this.a = a;
	this.b = b;
}
public Addition(double a, double b) {
	super();
	System.out.println("double construtor");
	this.a = (int) a;
	this.b = (int) b;
}

public void DoSum() {
	//System.out.println( +"= ");
}
@Override
public String toString() {
	return "Addition = " + (this.a+this.b) ;
}


}
