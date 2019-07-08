package com.kgisl.ar2arlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

class ReDpAr {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>(
                Arrays.asList("kannan", "devi", "magi", "tamil","mohana", "kannan", "devi", "magi", "mohana"));

        System.out.println(" before"+al);

        LinkedHashSet<String> hs = new LinkedHashSet<String>(al);
        System.out.println("after"+hs);


}
}