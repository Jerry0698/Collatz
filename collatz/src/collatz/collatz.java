package collatz;


public class collatz {
	
	public static void main(String[] args) {
		int startzahl = 838;
		while(startzahl>1){
			if (startzahl%2==0){
				startzahl=startzahl/2;
			}
				else{startzahl=(startzahl*3)+1;}
			
				if(startzahl>1){System.out.print(startzahl+", ");}
		

	}}

}
