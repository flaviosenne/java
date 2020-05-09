package agregacao;

import java.util.ArrayList;

public class State {
    private Integer name;
    private String initials;
    private ArrayList<City> city;
    
    public State(){
        this.city = new ArrayList();
    }
    public State(int name, String initials, ArrayList<City> city) {
        this.name = name;
        this.initials = initials;
        this.city = city;
    }
    
    public void setName(int name){
        this.name = name;
    }
    public void setInitials(String initials){
        this.initials = initials;
    }
    public void setCity(ArrayList<City> city){
        this.city = city;
    }
    
    
    public int getName(){
        return this.name;
    }
    public String getInitials(){
        return this.initials;
    }
  
    
    @Override
    public String toString(){
        return "State: "+ name +"\n initial "+ 
                initials + "\n Citys "+ city+
             "\n >>>>>>   <<<<<<< \n";
    }
    
    
    public int getCity(City city){
        return this.city.indexOf(city);
    }
    public void addCity(City city){
        this.city.add(city);
    }
    public boolean removeCity(City city){
        return this.city.remove(city);
    }
    public boolean updateCity(City actual, City neew){
        int pos = this.getCity(actual);
        if(pos != -1){
            this.city.set(pos, neew);
            return true;
        }
        else{ 
            return false;
        }
    }
        
}
