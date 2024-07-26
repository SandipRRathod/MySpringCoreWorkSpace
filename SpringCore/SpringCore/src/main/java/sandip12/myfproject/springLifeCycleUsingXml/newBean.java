package sandip12.myfproject.springLifeCycleUsingXml;

public class newBean {
//for example shop
	private String productName;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return "productName = " + productName ;
	}
	
	public void init() {
	   System.out.println("hellow world for Init method");
	}
	
    public void destroy() {
    	 System.out.println("hellow world for destroy method");
	}
    
    
    
}
