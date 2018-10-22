package Model;

public class HelloWorldStruts extends ActionSupport {
	
	private String name;

	   public String execute() throws Exception {
	      MessageStore name=new MessageStore();
		   return "success";
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }


}
