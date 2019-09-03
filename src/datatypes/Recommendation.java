package datatypes;


public class Recommendation {
	private int count;
	private String name;
	
	public Recommendation(String name, int count){
		this.count = count;
		this.name = name;
	}
	
	public String name(){ return name; }
	public int count(){return count; }
	
	public String toString(){
		return name +", "+ count;
	}
}
