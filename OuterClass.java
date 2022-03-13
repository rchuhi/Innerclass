/*Reginah Chuhi
	CIS221
	Tuesday and Thursday 2:10pm*/

public class OuterClass {

	private String name="Shadows";
	
			
		
//Create a getter and setter to get the name the private class
		public String getName() {
			return name;
		}

		public void setName(String name) {
			
			this.name = name;
		}
		//Nested InnerClass
		static class InnerClass {
			
		    private int year = 2019;
		    
		    public InnerClass(int year) {
				this.year=year;
		    }

			public int getYear() {
				return year;
			}

			public void setYear(int year) {
				this.year = year;
			}
		  }
		}

	

