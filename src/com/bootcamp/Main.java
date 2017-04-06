package com.bootcamp;
import static com.bootcamp.model.staticTest.staticMethods;

import com.bootcamp.model.staticTest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import com.bootcamp.model.ColorModel;
import jdk.nashorn.internal.parser.JSONParser;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JSONException {
        // write your code here
        String jsonString = "{"
                + "  \"geodata\": ["
                + "    {"
                + "      \"color\": \"red\","
                + "      \"value\": \"Julie Sherman\" },"
                + "    {"
                + "      \"color\": \"black\","
                + "      \"value\": \"Johnny\" }"
                + "  ]"
                + "}";
//       List colorList =  parseJson(jsonString);
//        ColorModel color;
//        Iterator <ColorModel> iterator = colorList.iterator();
//        while (iterator.hasNext()){
//            color = iterator.next();
//            System.out.println("Color = " + color.getColorCode());
//            System.out.println("Value = " + color.getColorValue());
//        }

       // new staticTest().staticMethods();
       // new staticTest().normalMethods();

        staticTest s = new staticTest();
//        (null)s.normalMethods();
//        (null)s.staticMethods();
        (s).normalMethods();

         staticTest s1 = null;
         s1.normalMethods();

    }

    static List parseJson(String json) {
        ColorModel color;
        List<ColorModel> list = new ArrayList<>();

        JSONObject obj = new JSONObject(json);
        JSONArray geodata = obj.getJSONArray("geodata");
        final int n = geodata.length();

        for (int i = 0; i < n; ++i) {
            color = new ColorModel();
            JSONObject obj1 = geodata.getJSONObject(i);
            color.setColorCode(obj1.getString("color"));
            color.setColorValue(obj1.getString("value"));
            list.add(color);
        }

        return list;
    }
}