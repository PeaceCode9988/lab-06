package com.example.listycity;
/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;
    /**
     * a constructor
     * @param city, province
     * set the city and province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * getter for city name
     * @return city
     * returns the current city name
     */
    String getCityName(){
        return this.city;
    }
    /**
     * getter for province name
     * @return province
     * returns the current province name
     */
    String getProvinceName(){
        return this.province;
    }
    /**
     * compares the this.city to city o
     * @param o
     * city o to be compared with the this.city
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}


