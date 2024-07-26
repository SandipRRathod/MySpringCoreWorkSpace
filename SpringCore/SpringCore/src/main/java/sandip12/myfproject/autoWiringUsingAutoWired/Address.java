package sandip12.myfproject.autoWiringUsingAutoWired;

public class Address {
	
	
private String dist;
private String Village;
public String getDist() {
	return dist;
}

public void setDist(String dist) {
	this.dist = dist;
}
public String getVillage() {
	return Village;
}
public void setVillage(String village) {
	Village = village;
}


@Override
public String toString() {
	return "Address [dist=" + dist + ", Village=" + Village + "]";
}

}
