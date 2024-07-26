package sandip12.myfproject.autoWiringUsingXml;


public class student {

private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "student [address=" + address + "]";
}


}
