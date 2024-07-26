package sandip12.myfproject.springLifeCycleUsingInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class newBean implements InitializingBean,DisposableBean{
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

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	 System.out.println("hellow world for Init method");
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("hellow world for distroy method");
}
   

}
