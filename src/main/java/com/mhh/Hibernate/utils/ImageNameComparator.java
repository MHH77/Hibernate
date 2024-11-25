package com.mhh.Hibernate.utils;

import java.util.Comparator;

public class ImageNameComparator implements Comparator<String> {

    @Override
    public int compare(String image1, String image2) {
        //return image2.compareTo(image1);//Desc
        return image1.compareTo(image2);//Asc
    }
}