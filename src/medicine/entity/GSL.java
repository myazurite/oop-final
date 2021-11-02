package medicine.entity;

public class GSL extends Medicine{
        public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setCategory(String category){
		this.category=category;
	}
	public String getCategory(){
		return category;
	}
	public void setComponent(String component){
		this.component=component;
	}
	public String getComponent(){
		return component;
	}
	public void setUsage(String usage){
		this.usage=usage;
	}
	public String getUsage(){
		return usage;
	}
}
