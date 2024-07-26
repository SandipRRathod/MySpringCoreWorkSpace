package sandip12.myfproject.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class employe {

	private String name;
	private List<String> phones;
	private Set<String> addreses;
	private Map<String,String> coures;
	private Properties props;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddreses() {
		return addreses;
	}
	public void setAddreses(Set<String> addreses) {
		this.addreses = addreses;
	}
	public Map<String, String> getCoures() {
		return coures;
	}
	public void setCoures(Map<String, String> coures) {
		this.coures = coures;
	}
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	@Override
	public String toString() {
		return "Employe Details \nname= " + name + ",\nphones= " + phones + ",\naddreses= " + addreses + ",\ncoures= " + coures + ",\nproperties= "+ props;
	}
	

	
}
