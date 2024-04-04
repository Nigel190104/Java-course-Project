package ProblemSet_6b;

public class Palette {
     private P_COLOUR[] primaryColours;
     
     public Palette(){
    	this.primaryColours = new P_COLOUR[3];
     }
     
	 public Palette(P_COLOUR[] colourArray) throws IllegalArgumentException{
		//what we will need is an illegal argument exception
		//this may be inclusive of if they also include more elements max 3
		//or aren't inclusive of the p_colour class
		 if(colourArray.length>3){
			 throw new IllegalArgumentException("Colour array is not of appropriate length");
		 }
		 this.primaryColours = colourArray;
	 }

	//this will create a string of all colours in the primary colours array
     public String getColours() {
    	 String output = "";
 		for(P_COLOUR colour : this.primaryColours) {
 			if (colour !=  null) {
 				if(colour == primaryColours[0]) {
 					String concatenate = colour + ", ";
 					output = output + concatenate;
 				}
 				else {
 					String concatenate = colour + "";
 					output = output + concatenate;
 				}
 			 }
 		}
 		if(primaryColours[0] == null && primaryColours[1] == null && primaryColours[2] == null) {
 				output = "No colours added";
 		}
 		return output;
     }
     //we have allowed them to add colours nut haven't performed 
     //validation in order
     //to make sure that they only add one of each, yet to be done
     public void addColour(P_COLOUR colour) {
    	 boolean colouradded = false;
    	 for(int i=0;i<=2;i++) {
    		 if(primaryColours[i] == null && colour !=primaryColours[0] && colour !=primaryColours[1]&& colour !=primaryColours[2]) {
    			  primaryColours[i] = colour;
    			  colouradded = true;  
    		 }
    		 if(colouradded == true) {
    				 i = 3; 
    		 }
    	 }
     }
}
/*
if(colour != P_COLOUR.RED || colour != P_COLOUR.BLUE || colour != P_COLOUR.YELLOW ) {
		throw new IllegalArgumentException(colour + ": is not a primary colour");
	}*/
//we need our good friend the null checker in order to make sure that any space in array
//that is empty is nto counted when performing operations.
// need to add validation in order to make su4ere only primary colours are added as inputs for the primary colours array.