
class Hotel {
	private String name;
	private Guste arrGuests[];
	private int nbGuests;

	public Hotel( String name,int size){

		this.name=name;
		arrGuests= new Guste[size];
		nbGuests = 0;
	}

	public boolean addGuest(Guste s){
		if(nbGuests<arrGuests.length){
			arrGuests[nbGuests]=s;
			nbGuests++;
			return true;
		}else


			return false;
	}
	public int countGuests(String nationality){
		int a=0;
		for(int i=0;i<nbGuests;i++){
			if(arrGuests[i].getNationality().equals(nationality)){
				a++; 
			}
		}
		//System.out.println(a);
		return a; 
	} 
	public Guste getOldestGuest(){
		int index=0;
		for(int i=0;i<nbGuests;i++){
			if(arrGuests[i].getAge()>arrGuests[index].getAge()){
				index=i;
			}
		}
		return arrGuests[index];
	} 

	public Guste[] getGuests(String nationality){
		Guste[] ruselt=new Guste[countGuests(nationality)]; 
		int j=0;
		for(int i=0;i<nbGuests;i++) {
			if(arrGuests[i].getNationality().equals(nationality)) {
				ruselt[j]=arrGuests[i];

				j++;

			}
		}
		return ruselt;
	}

	public int splitGuests(Guste []saudi,Guste[]expat) {
		int b=0;
		int s=0;
		for(int i=0;i<nbGuests;i++) {
			if(arrGuests[i].getNationality().equals("saudi")) {
				saudi[b]= arrGuests[i];
				b++;
			}else {
				expat[s]=arrGuests[i];
				s++;
			}
		}

		return s; }


}
