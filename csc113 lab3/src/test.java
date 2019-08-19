import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		 System.out.print("Enter the name of the hotel and number of the gusts:");
		
		Hotel d=new Hotel(input.next(), input.nextInt());
		System.out.println("To add a new guest, Enter 1\r\n" + 
				"To get the number of guests of a given nationality, Enter 2\r\n" + 
				"To get and display the oldest guest, Enter 3\r\n" + 
				"To get and display all guests of a given nationality, Enter 4\r\n" + 
				"To view all Saudi guests in the Hotel, Enter 5\r\n" + 
				"To Exit, Enter 0\r\n" + 
				"");
		
		for(int v=0;v!=-1;v++) {
		System.out.println("Enter Your Option:");
		int x=input.nextInt();
		if(x==1) {
			
			System.out.print("Enter id the guste and name and nationality and age");
			Guste b=new Guste(input.nextInt(),input.next(),input.next(),input.nextInt());
			if(d.addGuest(b)==true) {
				
			
			}else
				System.out.println("The hotel is full");
		}else 
			if(x==2) {
		   System.out.print("Enter the nationality");
		   System.out.println(d.countGuests(input.next()));
		}else 
			if(x==3) {
			if(d.getOldestGuest()==null) {
				System.out.println("The hotal is empty.");
				}else {
					d.getOldestGuest().displayInfo();
				}
		}else
			if(x==4) {
				System.out.println("Enter the nationality");
				
				Guste[] arr = d.getGuests(input.next());
				
					  for(int i=0;i<arr.length;i++) {   
						  if(arr[i]!=null) {
						arr[i].displayInfo();
					   
				   }else {
				System.out.println("This is  nationality does not exist ");
					}
				}
			}else
				if(x==5) {
					if(d.getGuests("saudi").equals("saudi")) {
					System.out.println("The all saudi in this hotal.");
					
				}else {
					System.out.println("we do not have any saudi");
				}
					
				}else
					break;
		
		
	   	   
	}  /*int numsaudi =d.countGuests("saudi");
    Guste[]saudi=new Guste[numsaudi];
   Guste[]expat=new Guste[size-numsaudi];
    d.splitGuests(saudi, expat);
   for(int i=0;i<numsaudi;i++) {
	   saudi[i].displayInfo();*/

}	

 }
	
