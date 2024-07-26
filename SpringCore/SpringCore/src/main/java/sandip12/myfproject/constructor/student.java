package sandip12.myfproject.constructor;

import java.util.List;
import java.util.Map;

public class student {
private String name;
private int StudentId;
private Certi certi;
private List<String> phones;
private Map<String,String> coures;
// for cundtructor and refrence type and collection type
public student(String name, int studentId, Certi certi,List<String> phones,Map<String,String> coures ) {
	super();
	this.name = name;
	StudentId = studentId;
	this.certi=certi;
	this.phones=phones;
	this.coures=coures;
}

@Override
public String toString() {
	return "student name and id and certificate name and phones and coures  [" + name + "=" + StudentId + "=" + certi + "="+ phones+ "="+ coures+" ]";
} 



}
