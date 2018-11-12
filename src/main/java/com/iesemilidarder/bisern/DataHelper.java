package com.iesemilidarder.bisern;

import com.iesemilidarder.bisern.data.Activity;
import com.iesemilidarder.bisern.data.Product;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {

    private static List<Product> lst = new ArrayList<>();

    public static List<Product> getProducts(){
        doInit();
        return lst;
    }

    public static void add(Product p){
        lst.add(p);
    }

    private static void doInit(){
        if(lst.isEmpty()){
            for (int i = 0; i < 10; i++) {
                Product aux = new Activity();
                aux.setName("actividad"+i);
                lst.add(aux);
            }
        }
    }

}
