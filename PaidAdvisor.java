 class PaidAdvisor extends Person {

	   // Attributes
	   private double regularPayRate;
	   private double overtimePayRate;
	   private double hoursWorked;
	   private double specialPayRate;
	   private double specialHours;
	   private double totalWages;
	   final private double REGULAR_HOURS=30;
	   /**
	   * Default constructor
	   */
	   public PaidAdvisor() {
	       
	   }
	  
	   /**
	   * Constructor
	   *
	   * @param first
	   * @param last
	   * @param hoursWorked
	   */
	   public PaidAdvisor(String first, String last, double hoursWorked,double specialHours) {
	       this(first,last);
	       this.regularPayRate = 25;
	       this.overtimePayRate = (this.regularPayRate + (this.regularPayRate / 2));
	       this.hoursWorked = hoursWorked;
	       this.specialPayRate = 50;
	       this.specialHours = specialHours;
	      
	      
	   }

	   /**
	   * Constructor
	   *
	   * @param regularPayRate
	   * @param hoursWorked
	   */
	   public PaidAdvisor(String firstName,String lastName) {
		   super(firstName,lastName);
	       
	   }

	   /**
	   * @return the regularPayRate
	   */
	   public double getPayRate() {
	       return this.regularPayRate;
	   }

	   /**
	   * @return the hoursWorked
	   */
	   public double getHoursWorked() {
	       return this.hoursWorked;
	   }

	   /**
	   * Sets the name, payrates and hours worked
	   *
	   * @param firstName
	   * @param lastName
	   * @param regularPayRate
	   * @param overtimePayRate
	   * @param hoursWorked
	   */
	   public void setNameRateHours(String firstName, String lastName,
	           float regularPayRate, float hoursWorked) {
	       setName(firstName, lastName);
	       this.regularPayRate = regularPayRate;
	       this.overtimePayRate = (this.regularPayRate + (this.regularPayRate / 2));
	       this.hoursWorked = hoursWorked;
	       this.specialHours = specialHours;
	   }

	   /**
	   * Calculates the multiplication of the pay rate (the regular pay rate and
	   * the overtime pay rate) and the hours worked
	   *
	   * @return
	   */
	   public double  calculatePay() {
		  
	       if(this.hoursWorked <= REGULAR_HOURS)
	    	   
	    	   totalWages = this.regularPayRate * this.hoursWorked;
	       else if( specialHours > 0)  //250 +187.5 + 750
	    	   totalWages= (this.specialHours*specialPayRate) + (this.regularPayRate *REGULAR_HOURS) + this.overtimePayRate *(this.hoursWorked - REGULAR_HOURS-specialHours);
	       else
	    	   totalWages= (this.regularPayRate * REGULAR_HOURS) + this.overtimePayRate *(this.hoursWorked - REGULAR_HOURS);
	       
	       //wage = wage + (this.regularPayRate * this.hoursWorked);
	      
	       return totalWages;
	   }

	   @Override
	   public String toString() {
	       return "PaidAdvisor " + super.toString() +
	               "\nPay Rate: $" + this.regularPayRate + "/hour" +
	    		   "\nSpecial Rate $"+ this.specialPayRate + "/hour"+
	               
	               "\nHours Worked: " + this.hoursWorked +
	               "\nSpecial Hours Worked: " + this.specialHours +
	               "\nTotal Wages: $"+ totalWages ;
	   }
	}






