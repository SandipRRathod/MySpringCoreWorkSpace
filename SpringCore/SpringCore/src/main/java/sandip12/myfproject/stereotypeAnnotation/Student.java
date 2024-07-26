package sandip12.myfproject.stereotypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Student {
	
private String fname;

private String lname;
	

	
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}


@Override
public String toString() {
	return "Student [fname=" + fname + ", lname=" + lname + "]";
}

}
