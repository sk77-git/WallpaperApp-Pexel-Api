package com.example.pexawall;

public class WallpaperModel {
    private int id;
    private String original,medium;

    public WallpaperModel() {
    }

    public WallpaperModel(int id, String original, String medium) {
        this.id = id;
        this.original = original;
        this.medium = medium;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }
}
