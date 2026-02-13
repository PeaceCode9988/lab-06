package com.example.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * This checks whether or not a city is exist in the list.
     * @param city
     * Check if this city exist in the list.
     * @return
     * true if the city is exist in the list, false if not.
     */
    public boolean hasCity(City city){
        for(int crrentindex=0; crrentindex<cities.size(); crrentindex++){
            City currentcity = cities.get(crrentindex);
            if(currentcity.getCityName().equals(city.getCityName())&&currentcity.getProvinceName().equals(city.getProvinceName())){
                return true;
            }
        }
        return false;
    }
    /**
     * This deletes a city from the list
     * @param city
     * deletes this city from the list.
     */
    public void delete(City city){
        for(int crrentindex=0; crrentindex<cities.size(); crrentindex++){
            City currentcity = cities.get(crrentindex);
            if(currentcity.getCityName().equals(city.getCityName())&&currentcity.getProvinceName().equals(city.getProvinceName())){
                cities.remove(crrentindex);
                return;
            }
        }
        throw new IllegalArgumentException("Delete Error, city doesn't exist in the list");
    }

    /**
     * This checks how many cities are in the list.
     * @return size
     * returns the size of the cities list.
     */
    public int countCities(){
        int size = cities.size();
        return size;
    }
}
