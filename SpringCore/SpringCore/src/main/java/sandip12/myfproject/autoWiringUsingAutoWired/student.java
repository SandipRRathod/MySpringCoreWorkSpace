package sandip12.myfproject.autoWiringUsingAutoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class student {
	
	@Autowired
	@Qualifier("studentaddress")
// for more than two beans we use @qulifier("nameofthebean you want execute") annotation for anambiguty
private Address address;

public Address getAddress() {
	
	return address;
}


public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return address + "";
}

}
