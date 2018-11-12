package com.iesemilidarder.bisern;

import com.iesemilidarder.bisern.data.*;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {

    /*Metodo para filtrar por id*/
    public static Product getProduct(String id){
        return lst.stream().filter(t ->t.getId().equals(id)).findFirst().get();
    }

    private static List<Product> lst = new ArrayList<>();

    public static List<Product> getProducts(){
        doInit();
        return lst;
    }

    /*Metodo añadir producto*/
    public static void add(Product p){
        lst.add(p);
    }

    private static void doInit(){
        if(lst.isEmpty()){
            for (int i = 0; i < 10; i++) {
                Product aux = new Activity();
                aux.setName("actividad"+i);
                lst.add(aux);
               // System.out.print(getProducts());
            }
        }
    }
}