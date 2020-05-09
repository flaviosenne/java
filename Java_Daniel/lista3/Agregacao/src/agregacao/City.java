package agregacao;
public class City {
    private String name;
    private Integer population;
    
    
    public City(String name, int population){
        this.name = name;
        this.population = population;
    }
    public City(){
        
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setPopulation(int population){
        this.population = population;
    }
    
    public String getName(){
        return this.name;
    }
    public int getPopulation(){
        return this.population;
    }
    
    
    @Override
    public String toString(){
        return "\n ----------City--------- \n" + getName() +
                "\n Population: "+ getPopulation()+
                "\n-----------------------";
    }
}
