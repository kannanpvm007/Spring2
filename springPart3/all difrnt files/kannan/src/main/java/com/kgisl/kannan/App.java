package com.kgisl.kannan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class App {
    
    public static void main(String args[]) throws IOException{
        File f1=new File("D://shortlist.txt");
        File f2=new File("D://mahi2.txt");
        String name=null;
        
        BufferedReader buffReader1=new BufferedReader(new FileReader(f1));
        BufferedReader buffReader2=new BufferedReader(new FileReader(f2));
        
        Set<String> set1=new HashSet<String>();
       Set<String> set2=new HashSet<String>();
       Set<String> set3=new HashSet<String>();
       //System.out.println(buffReader1.readLine()+"***");
        
        while(( name=buffReader1.readLine())!=null){
            String words[]=name.split(",");
            for (String var : words) {
                set1.add(var);
            }
            set3.addAll(set1);
            
        }
        while(( name=buffReader2.readLine())!=null){
            String words[]=name.split(",");
            for (String var : words) {
                set2.add(var);
            }
        }
        
         set1.retainAll(set2);
    

        System.out.println("size of shortlist file"+set3.size());
        
        System.out.println("size of mahi2 file"+set2.size());
        System.out.println("common words"+set1.size());
        
    }

}