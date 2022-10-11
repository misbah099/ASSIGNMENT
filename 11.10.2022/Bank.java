package assignments;

/* Consider a scenario where Bank is a class that provides 
functionality to get the rate of interest. 
However, the rate of interest varies according to banks. 
For example, SBI, ICICI and AXIS banks could 
provide 8%, 7%, and 9% rate of interest. */ 
class Bank{  
int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class SBI extends Bank{  
int getRateOfInterest(){return 8;}  //method Overriding is performing here
}  

class ICICI extends Bank{  
int getRateOfInterest(){return 7;}  //method Overriding is performing here
}  
class AXIS extends Bank{  
int getRateOfInterest(){return 9;}  //method Overriding id performing here
}  
