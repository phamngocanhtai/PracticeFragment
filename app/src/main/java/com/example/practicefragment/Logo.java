package com.example.practicefragment;

import java.util.ArrayList;

public class Logo {
    String name;
    String description;
    int avatar;

    public Logo(String name, String description, int avatar) {
        this.name = name;
        this.description = description;
        this.avatar = avatar;
    }

    public static ArrayList<Logo> init () {
        ArrayList<Logo> tmp = new ArrayList<>();
        tmp.add(new Logo("AI", "Adobe AI", R.drawable.icon_ai));
        tmp.add(new Logo("ID", "Adobe InDesign", R.drawable.icon_indesign));
        tmp.add(new Logo("PS", "Adobe Photoshop", R.drawable.icon_photoshop));
        tmp.add(new Logo("PR", "Adobe Premiere", R.drawable.icon_premiere));
        tmp.add(new Logo("AI", "Adobe AI", R.drawable.icon_ai));
        tmp.add(new Logo("ID", "Adobe InDesign", R.drawable.icon_indesign));
        tmp.add(new Logo("PS", "Adobe Photoshop", R.drawable.icon_photoshop));
        tmp.add(new Logo("PR", "Adobe Premiere", R.drawable.icon_premiere));
        tmp.add(new Logo("AI", "Adobe AI", R.drawable.icon_ai));
        tmp.add(new Logo("ID", "Adobe InDesign", R.drawable.icon_indesign));
        tmp.add(new Logo("PS", "Adobe Photoshop", R.drawable.icon_photoshop));
        tmp.add(new Logo("PR", "Adobe Premiere", R.drawable.icon_premiere));
        tmp.add(new Logo("AI", "Adobe AI", R.drawable.icon_ai));
        tmp.add(new Logo("ID", "Adobe InDesign", R.drawable.icon_indesign));
        tmp.add(new Logo("PS", "Adobe Photoshop", R.drawable.icon_photoshop));
        tmp.add(new Logo("PR", "Adobe Premiere", R.drawable.icon_premiere));
        tmp.add(new Logo("AI", "Adobe AI", R.drawable.icon_ai));
        tmp.add(new Logo("ID", "Adobe InDesign", R.drawable.icon_indesign));
        tmp.add(new Logo("PS", "Adobe Photoshop", R.drawable.icon_photoshop));
        tmp.add(new Logo("PR", "Adobe Premiere", R.drawable.icon_premiere));
        tmp.add(new Logo("AI", "Adobe AI", R.drawable.icon_ai));
        tmp.add(new Logo("ID", "Adobe InDesign", R.drawable.icon_indesign));
        tmp.add(new Logo("PS", "Adobe Photoshop", R.drawable.icon_photoshop));
        tmp.add(new Logo("PR", "Adobe Premiere", R.drawable.icon_premiere));

        return tmp;
    }
}
