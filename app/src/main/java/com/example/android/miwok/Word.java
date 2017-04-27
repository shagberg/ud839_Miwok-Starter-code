package com.example.android.miwok;

/**
 * Word class to define the Miwok translations
 * Created by z017644 on 4/26/17.
 */

public class Word {

    // Default translation
    private String mDefaultTranslation;

    // Miwoc word
    private String mMiwokTranslation;

    // Constructor
    public void setWord(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get Miwok translation
     */
    public String getMiwocTranslation() {
        return mMiwokTranslation;
    }
    /**
     * Get Default translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}