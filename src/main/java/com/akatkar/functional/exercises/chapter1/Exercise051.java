package com.akatkar.functional.exercises.chapter1;

import java.util.List;
import java.util.stream.Collectors;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Exercise051 {
    
    private static JSONObject getJson(String key, String value){
        JSONObject result = new JSONObject();
        result.put(key, value);
        return result;        
    }
    
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        
        jsonArray.add(getJson("name", "John"));
        jsonArray.add(getJson("name", "David"));
        
        List list = (List) jsonArray.stream()
                    .map(json -> json.toString())
                    .collect(Collectors.toList());
        System.out.println(list);
    }
}