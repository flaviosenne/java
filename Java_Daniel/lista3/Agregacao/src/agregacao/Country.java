package agregacao;

import java.util.ArrayList;

public class Country {
    private String continent;
    private String initials;
    private ArrayList<State> state;
    private ArrayList<City> city;
    
    Country(String continent, String initials, ArrayList<State> state){
        this.continent = continent;
        this.initials = initials;
        this.state = state;
    }
    Country(){
        this.continent = "indefinido";
        this.initials = "indefinido";
        this.state = new ArrayList();
    }
    
    public String getContinent(){
        return this.continent;
    }
    public String getInitials(){
        return this.initials;
    }
    public ArrayList<State> getState(){
        return this.state;
    }
    
    
    public void setContinent(String continent){
        this.continent = continent;
    }
    public void setInitials(String initials){
        this.initials = initials;
    }
    public void setState(ArrayList<State> state){
        this.state = state;
    }
    
   public String toString(){
       return "///// Country ////"+ "\n Continent " + this.continent +
               "\n Initials " + this.initials + "\n"+
               this.state +
              "\n ////      /////";
   }
   
   public void addState(State state){
       this.state.add(state);
   }
   
   public boolean removeState(State state){
       return this.state.remove(state);
   }
   
   public int getState(State state){
       return this.state.indexOf(state);
   }
   
   public boolean updateState(State actual, State neew){
       int pos = this.getState(actual);
       if(pos != -1){
           this.state.set(pos, neew);
           return true;
       }
       else{
           return false;
       }
   }
    
   
   public boolean addCityState(City city, State state){
       int pos = this.getState(state);
       if(pos != -1){
           state.addCity(city);
           return true;
       }else{
           return false;
       }
   }
}
