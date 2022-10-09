package HashMapsDS;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//HashMap store value in key value format
//Does not store data in sorted order
//Time complexity to retrieve a dat is O(1)
public class HashMapsOperations {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        //Insert records in HashMap
        map.put(1,"Vishal");
        map.put(2,"Ram");
        map.put(3,"Tom");
        map.put(4,"Sam");

        //Create a set to get the entire entry set
        Set<Map.Entry<Integer,String>> entrySet=map.entrySet();

        //Iterate over the set and print all the records
        for(Map.Entry<Integer,String> entry:entrySet){
            System.out.println(entry.getKey()+", "+entry.getValue());
        }

        System.out.println("*******************************************");


        HashMap<Integer,String> map1 = new HashMap<>();
        //Copy all the data from one map to another
        map1.putAll(map);
        map1.put(5,"Dev");
        //Remove keys based on key
        map1.remove(1);

        //Replace key,value
        map1.replace(2,"Hello");

        Set<Map.Entry<Integer,String>> entrySet1 = map1.entrySet();

        for(Map.Entry entry1: entrySet1){
            System.out.println(entry1.getKey()+", "+entry1.getValue());
        }

        //Get all the keys from entry set
        Set<Integer> keyset=map1.keySet();

        for(int key:keyset){
            System.out.println("Keys: "+key);
        }

        //Get all the values from entry set
        String values= map1.values().toString();
        System.out.println(values);

        //Check if key exists or not
        System.out.println("Check if key exists or not: "+map1.containsKey(4));

        //Check if value exists or not
        System.out.println("Check if value exists or not: "+map1.containsValue("Tim"));

        //Get size of the map
        System.out.println("Size of the map is: "+map1.size());

        //Sort a Hash Map
        TreeMap sortedMap = new TreeMap(map1);
        System.out.println("Sorted HashMap: "+sortedMap);

        //To clear entire map
        map1.clear();

        //To change default Capacity and Load factor of a HashMap
        HashMap<Integer,String> map2 = new HashMap<>(30,0.50f);

        /*
        Default Capacity of a map is :  16
        Default Load Factor of Map is: 0.75 -----> 75% of Capacity


       Updated Capacity=30 & Load Factor is 0.50

       Threshold is calculated as Capacity * Load Factor
         */



    }



}
