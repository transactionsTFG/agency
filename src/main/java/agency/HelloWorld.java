package agency;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class HelloWorld {
	
	private String result;
	
	public void setResult() {
		result = "Hello World started!";
	}
	
	public String getResult() {
		return result;
	}

}
