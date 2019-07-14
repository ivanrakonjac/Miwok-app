package com.example.android.miwok;

/**
 * Created by Ivan on 14/07/2019.
 */

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;

    public Word(String miwok,String def){
        this.miwokTranslation=miwok;
        this.defaultTranslation=def;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

}
