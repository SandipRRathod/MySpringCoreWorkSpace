package sandip12.myfproject.autoWiringUsingXml;

public class Address {
private String dist;
private String village;
public String getDist() {
	return dist;
}
public void setDist(String dist) {
	this.dist = dist;
}
public String getVillage() {
	return village;
}
public void setVillage(String village) {
	this.village = village;
}
@Override
public String toString() {
	return "Address [dist=" + dist + ", village=" + village + "]";
}



}
