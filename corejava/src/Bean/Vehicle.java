package Bean;

public class Vehicle {
	
	// java bean  
	
		// all variable private 
		// and getter setter to access them variable 
		// all argument constructor  
		//no argument constructor 
		// to String method
		
			
		 private String vehNumber  ;
			
		 private String vehModel ;
			
		 private double vehPrice ;

		public String getVehNumber() {
			return vehNumber;
		}

		public void setVehNumber(String vehNumber) {
			this.vehNumber = vehNumber;
		}

		public String getVehModel() {
			return vehModel;
		}

		public void setVehModel(String vehModel) {
			this.vehModel = vehModel;
		}

		public double getVehPrice() {
			return vehPrice;
		}

		public void setVehPrice(double vehPrice) {
			this.vehPrice = vehPrice;
		}

		// all argument
		public Vehicle(String vehNumber, String vehModel, double vehPrice) {
			super();
			this.vehNumber = vehNumber;
			this.vehModel = vehModel;
			this.vehPrice = vehPrice;
		}
		
		
		public void speed() {
			System.out.println("sachin is sdasdfasd");
		}
		// no argument
		 
		public Vehicle() {}

		@Override
		public String toString() {
			return "Vehicle [vehNumber=" + vehNumber + ", vehModel=" + vehModel + ", vehPrice=" + vehPrice + "]";
		} ;
		
		
		
		
		
		 
	}


