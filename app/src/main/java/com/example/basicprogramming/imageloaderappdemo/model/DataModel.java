package com.example.basicprogramming.imageloaderappdemo.model;

import java.util.ArrayList;

public class DataModel {

    private static ArrayList<Images> imagesArrayList;
    private static Images images;

    public static ArrayList<Images> setDataList() {

        imagesArrayList = new ArrayList<>();

        images = new Images("Avengers",
                "http://imagizer.imageshack.us/a/img921/5180/7hAeJE.jpg");
        imagesArrayList.add(images);
        images = new Images("Tomb Raider",
                "http://imagizer.imageshack.us/a/img924/5291/UCIHD7.jpg");
        imagesArrayList.add(images);
        images = new Images("Jurassic World",
                "http://imagizer.imageshack.us/a/img924/3383/8XKZ3w.jpg");
        imagesArrayList.add(images);
        images = new Images("Aqua Man",
                "http://imagizer.imageshack.us/a/img921/871/1p4Wu8.jpg");
        imagesArrayList.add(images);
        images = new Images("Rampage",
                "http://imagizer.imageshack.us/a/img924/2996/AgXYAe.jpg");
        imagesArrayList.add(images);
        images = new Images("Black Panther",
                "http://imagizer.imageshack.us/a/img921/1728/pvgE5Y.jpg");
        imagesArrayList.add(images);
        images = new Images("Fall Out",
                "http://imagizer.imageshack.us/a/img923/8599/10eqwW.jpg");
        imagesArrayList.add(images);
        images = new Images("Skyscraper",
                "http://imagizer.imageshack.us/a/img924/4840/oVQxeT.jpg");
        imagesArrayList.add(images);
        images = new Images("Ant Man",
                "http://imagizer.imageshack.us/a/img922/7827/fmGCRt.jpg");
        imagesArrayList.add(images);
        images = new Images("Annihilation",
                "http://imagizer.imageshack.us/a/img921/2873/0h2rRY.jpg");
        imagesArrayList.add(images);
        images = new Images("Solo Star Wars",
                "http://imagizer.imageshack.us/a/img921/336/EVhWv6.jpg");
        imagesArrayList.add(images);
        images = new Images("Venom 10.5.18",
                "http://imagizer.imageshack.us/a/img923/2247/OTPLoP.jpg");
        imagesArrayList.add(images);
        images = new Images("Tag 2018",
                "http://imagizer.imageshack.us/a/img922/6458/ilYyI2.jpg");
        imagesArrayList.add(images);
        images = new Images("Ocean's 8",
                "http://imagizer.imageshack.us/a/img924/3826/ApvmkO.jpg");
        imagesArrayList.add(images);
        images = new Images("Quiet Place",
                "http://imagizer.imageshack.us/a/img921/3276/qnjwjK.jpg");
        imagesArrayList.add(images);
        images = new Images("Pacific Rim",
                "http://imagizer.imageshack.us/a/img924/1622/MEdrZg.jpg");
        imagesArrayList.add(images);
        images = new Images("Red Sparrow",
                "http://imagizer.imageshack.us/a/img923/2267/M9tIUV.jpg");
        imagesArrayList.add(images);
        images = new Images("Wrinkle In Time",
                "http://imagizer.imageshack.us/a/img922/4871/T54L2a.jpg");
        imagesArrayList.add(images);

        return imagesArrayList;
    }
}
