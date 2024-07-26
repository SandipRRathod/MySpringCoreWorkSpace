package sandip12.myfproject.removeXml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Sandip Raju Rathod")
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Student [name=" + name + "]";
}

}
