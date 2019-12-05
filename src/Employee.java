/***********************************************************************
 * Programmer: Simrat Braha
 * Class: CS30S
 *
 * Assignment: December Exam
 * Program Name: Employee
 *
 * Description: brief description of program
 ***********************************************************************/
 
// ********** Import Java Libraries **********

public class Employee {  // begin class
    
    // ********** Class Variables **********
    
        public static int nextID = 1000;                                        // unique ID for each employee
    
    // ********** Instance Variables **********
        
        private int ID = 0;                                                     // unique ID
        private int hours = 0;                                                  // weekly worked hours
        private double wage = 0.0;                                              // hourly wage
        
        double payREG = 0.0;                                                    // regular pay
        double payOT = 0.0;                                                     // overtime pay
        double payGROSS = 0.0;                                                  // gross pay
            	
    // ********** Constructors **********
        
        /***********************************************************
        * Description: Create a new Employee object
        * 
        * Interface:
        * 
        * @param    
        * 
        * @return
        ***********************************************************/
        public Employee(){ // begin constructor
            
            ID = nextID++;                                                      // set and increment ID
            hours = 0;                                                          // weekly worked hours
            wage = 0.0;                                                         // hourly wage
            
        } // end constructor
        
        /***********************************************************
        * Description: Create a new Employee object
        * 
        * Interface:
        * 
        * @param    h: int
        * @param    w: double
        * 
        * @return
        ***********************************************************/
        public Employee(int h, double w){ // begin constructor
            
            ID = nextID++;                                                      // set and increment ID
            hours = h;                                                          // weekly worked hours
            wage = w;                                                           // hourly wage
            
        } // end constructor
    	
    // ********** Getters **********
        
        /***********************************************************
        * Description: Get employee's unique ID
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   ID: int
        ***********************************************************/
        public int getID(){ // begin getter
            
            return this.ID;                                                     // return employee's ID
            
        } // end getter
        
        /***********************************************************
        * Description: Get employee's hours worked
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   hours: int
        ***********************************************************/
        public int getHours(){ // begin getter
            
            return this.hours;                                                  // return hours worked
            
        } // end getter
        
        /***********************************************************
        * Description: Get employee's hourly wage
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   wage: double
        ***********************************************************/
        public double getWage(){ // begin getter
            
            return this.wage;                                                   // return hourly wage
            
        } // end getter
        
        /***********************************************************
        * Description: Get employee's regular pay
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   payREG: double
        ***********************************************************/
        public double getREG(){ // begin getter
          
            if(hours <= 40){ // begin if
                
                payREG = hours * wage;
                
            } // end if
            
            return this.payREG;                                                 // return regular pay
            
        } // end getter
        
        /***********************************************************
        * Description: Get employee's overtime pay
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   payOT: double
        ***********************************************************/
        public double getOT(){ // begin getter
          
            if(hours > 40){ // begin if
                
                payOT = (hours - 40) * (wage * 1.5);
                
            } // end if
            
            return this.payOT;                                                  // return overtime pay
            
        } // end getter
        
        /***********************************************************
        * Description: Get employee's gross pay
        * 
        * Interface:
        * 
        * @param
        * 
        * @return   payGROSS: double
        ***********************************************************/
        public double getGROSS(){ // begin getter
          
            payGROSS = payREG + payOT;
            
            return this.payGROSS;                                               // return gross pay
            
        } // end getter
	    	
    // ********** Setters **********
        
         /***********************************************************
        * Description: Set a new value for employee's hours worked
        * 
        * Interface:
        * 
        * @param    h: hours
        * 
        * @return
        ***********************************************************/
        public void setWage(int h){ // begin setter
            
            hours = h;                                                          // set new hours worked
            
        } // end setter
        
        /***********************************************************
        * Description: Set a new value for employee's hourly wage
        * 
        * Interface:
        * 
        * @param    w: wage
        * 
        * @return
        ***********************************************************/
        public void setWage(double w){ // begin setter
            
            wage = w;                                                           // set new wage
            
        } // end setter

}  // end class
