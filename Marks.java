import java.util.ArrayList;

public class Marks<M extends Number>{
	private ArrayList<M> List;
	
	public Marks(){
		List = new ArrayList<M>();
	}
	public Marks(ArrayList <M> SetList){
		List = SetList;
	}
	public Marks(Marks<M> OtherList){
		List = OtherList.List;
	}
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	public void setList(ArrayList<M> NewList){
		List = NewList;
	}
	public ArrayList<M> getList(){
		return List;
	}
	public boolean equals(Object Other){
		if(Other == null){
			return false;
		}
		else if(getClass() != Other.getClass()){
			return false;
		}
		else{
			Marks<M> NewList = (Marks<M>)Other;
			return List.equals(NewList.List);
		}
	}
	public String toString(){
		String Output = "";
		for(M Item : List){
			
			Output += Item.toString();
		}
		return Output;
	}
	public ArrayList<Double> getDouble(){
		ArrayList<Double> NewList =new ArrayList();
		for(M Item : List){
			NewList.add(Item.doubleValue());
			
		}
		return NewList;
	}
	public double getAverage(ArrayList<Double> DoubleList){
		DoubleList.trimToSize();
		double sum =0;
		for(Double Item : DoubleList){
			sum += Item;
		}
		double average = sum/DoubleList.size();
		return average;
	}
	
	
}
