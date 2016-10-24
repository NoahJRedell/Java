class Asc {
	public static void main (String a[]){
		//variables
		int i; //integer
		char c; //character
		//for loop
		for (i = 0; i < 256; i++){
			c = (char)i;
			System.out.	print(i+"="+c+" ");
			if(i % 10 == 0) {System.out.println();}
			//System.out.print(" ");
			//System.out.print(c);
				//System.out.print(" ");
		}
	}
}
