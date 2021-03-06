package agregacao;
public class testCoutry {
    public static void main(String[] args) {
        City city1 = new City();
        city1.setName("franca");
        city1.setPopulation(40000);
        
        City city2 = new City();
        city2.setName("Ribeirao");
        city2.setPopulation(3400000);
        
        City city3 = new City("Sao Paulo", 760000);
//        System.out.println(city2.toString());
        
        State state1 = new State();
        state1.setName("São Paulo");
        state1.setInitials("SP");
        state1.addCity(city1);
        state1.addCity(city2);
        
        State state2 = new State();
        state2.setName("Minas Gerais");
        state2.setInitials("MG");
        state2.addCity(city1);
        state2.addCity(city2);
        state2.addCity(city3);
        state2.addCity(new City("Santos", 7674863));
//        state2.removeCity(city2);
        state2.updateCity(city2, new City("Campinas", 57319076));
//        

//        System.out.println(state1.toString());
        City city5 = new City();
        city5.setName("São Carlos");
        city5.setPopulation(57498574);
        
        Country country1 = new Country();
        country1.setContinent("Brasileiro");
        country1.setInitials("Br");
        country1.addState(state1);
        country1.addState(state2);
        
        country1.addCityState(city5, state2);
        
        System.out.println(country1.toString());
    }
    
}
