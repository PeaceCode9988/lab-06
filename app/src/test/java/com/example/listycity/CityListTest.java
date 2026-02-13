package com.example.listycity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }



    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));

        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);

        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    void testHasCity(){
        CityList cityList = mockCityList();
        City city = new City("Edmonton", "Alberta");
        assertTrue(cityList.hasCity(city));
    }

    @Test
    void testDoesntHasCity(){
        CityList cityList = mockCityList();
        City city = new City("Testcity1", "Testcity2");
        assertFalse(cityList.hasCity(city));
    }

    @Test
    void testDeleteCity(){
        CityList cityList = mockCityList();
        City city1 = new City("Testcity1", "Testcity2");
        cityList.add(city1);
        assertEquals(2, cityList.countCities());
        City city2 = new City("Edmonton", "Alberta");
        cityList.delete(city1);
        assertEquals(1, cityList.countCities());
        cityList.delete(city2);
        assertEquals(0, cityList.countCities());
    }

    @Test
    void testDeleteCityexceptionisactuallythrown(){
        CityList cityList = mockCityList();
        City city1 = new City("testcitydoesntexist", "testcitydoesntexist1");
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(city1);
        });
    }

    @Test
    void testCountCities(){
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());
        cityList.add(new City("11", "111"));
        assertEquals(2, cityList.countCities());
        cityList.add(new City("22", "222"));
        assertEquals(3, cityList.countCities());
    }
}
