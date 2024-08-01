package Keerthi;

import java.util.Stack;

//Define a CityStack class to demonstrate a stack of City objects

public class CityStack {
	
 public static void main(String[] args) {
	 
     // Create a new Stack to store City objects
     Stack<DemoCity> cityStack = new Stack<>();

     // Push three City objects onto the stack
     cityStack.push(new DemoCity("HYD", 97.5));
     cityStack.push(new DemoCity("MDCL", 86.3));
     cityStack.push(new DemoCity("PDPL", 78.1));
     
     // Retrieve the top City object from the stack (without removing it)
     DemoCity topCity = cityStack.peek();
     System.out.println("Top City: " + topCity.name);

     // Search for a specific city in the stack
     String searchCity = "MDCL";
     for (DemoCity city : cityStack) {
         if (city.name.equals(searchCity)) {
             System.out.println(searchCity + " found with literacy rate: " + city.literacyRate);
             break;
         }
     }
 }
}