public class ThisDemo {

    private static String DEFAULT_VALUE ="REQUIRED"; 
    private String value;

    public ThisDemo() {
        this(DEFAULT_VALUE);
    }

    public ThisDemo(String value) {
        // Required here because the private member and parameter have same name
        this.value = value;
    }

    public String getValue() { 
        // Not required here, but I prefer to add it.  
        return value;
    }
    void siva(){
    System.out.println("Inside Siva Method ");
    }
    public static void main(String[] args){
    	ThisDemo.DEFAULT_VALUE = "Vani";
    	ThisDemo demo = new ThisDemo();
    	demo.siva();	
    	System.out.println(demo.getValue());
    }
}