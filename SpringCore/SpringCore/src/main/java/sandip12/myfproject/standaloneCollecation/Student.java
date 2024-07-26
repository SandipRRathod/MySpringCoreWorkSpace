package sandip12.myfproject.standaloneCollecation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Sandip Raju Rathod")
private String name;
	@Value("#{phones}")
private List<String> phone;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhone() {
	return phone;
}
public void setPhone(List<String> phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Student [name=" + name + ", phone=" + phone + "]";
}

}
