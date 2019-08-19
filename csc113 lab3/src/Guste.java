class Guste {
	private  int id=0;
	private String name=null;
	private String nationality=null;
	private int age=0;
	
	public Guste(int id,String name, String nationality,int age){
		this.id=id;
		this.name=name;
		this.nationality=nationality;
		this.age=age;
	}

    public int getId(){
    	return id;
    }

	public String getName(){
		return name;
	}
    public String getNationality(){
    	return nationality;
    }

    public int getAge(){
    	return age;
    }
    
    public void displayInfo(){
        System.out.println("The id for guste:"+id);
    	System.out.println("The name for guste:"+name);
    	System.out.println("The nationality for guste:"+nationality);
    	System.out.println("The age for guste:"+age);
    	
    }
    

}