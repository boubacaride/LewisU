
public class Person {
	
	
	 // Attributes
	   private String firstName;
	   private String lastName;

	   /**
	   * Default constructor
	   */
	   public Person() {
	       this.firstName = "";
	       this.lastName = "";
	   }

	   /**
	   * Parameterized constructor
	   *
	   * @param first
	   * @param last
	   */
	   public Person(String first, String last)
	   {
	       setName(first, last);
	   }
	   public String toString() 
	   {
	       return (firstName + " " + lastName);
	   }
	     
	   public void setName(String first, String last)
	   {
	       this.firstName = first;
	       this.lastName = last;
	   }

	    public String getFirstName()
	   {
		   return firstName;
	   }
	   public String getLastName()
	   {
		   return lastName;

	    	  
	       }
	       } 