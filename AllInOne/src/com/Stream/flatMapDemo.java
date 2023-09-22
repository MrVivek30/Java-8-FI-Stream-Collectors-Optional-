package com.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatMapDemo {

    //intermediate------------------------------

    public static void main(String args[]) {

//creating ArrayList    ------------------------------------

        List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
        List<String>  productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");
        List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
        List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");

        // List of list banunga mai----------------------
        List<List<String>> allproducts = new ArrayList<List<String>>();

//adding elements to the list  
        allproducts.add(productlist1);
        allproducts.add(productlist2);
        allproducts.add(productlist3);
        allproducts.add(productlist4);
//creating a list of all products

        List<String> listOfAllProducts = new ArrayList<String>();

//for each loop iterates over the list  
        for(List<String> pro : allproducts){
            for(String product : pro)
            {
//adds all products to the list      
                listOfAllProducts.add(product);
            }
        }
        System.out.println("List Before Applying mapping and Flattening: \n");
//prints stream before applying the flatMap() method  
        System.out.println(listOfAllProducts);
        System.out.println();


//creats a stream of elemnts using flatMap()====================================================



        System.out.println("List After Applying Mapping and Flattening Operation: \n");

        //prints the new stream that we get after applying mapping and flattening
        System.out.println( allproducts .stream().flatMap(pList -> pList.stream()).collect(Collectors.toList()));


        // do loop iterate krne ka problem solve kiya easily on liner code-----------------------

       //                                                                                                                                                                                                                                        List::stream
        List country = Stream.of(Arrays.asList("Colombia", "Finland", "Greece", "Iceland", "Liberia", "Mali", "Mauritius"), Arrays.asList("Peru", "Serbia", "Singapore", "Turkey", "Uzbekistan", "Yemen", "Zimbabwe", "Greece", "Iceland")).flatMap(s->s.stream() ) .collect(Collectors.toList());

    }
}  