package com.example.android.miwok;

/**
 * Created by E244194 on 6/8/2017.
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains default translation and a Miwok translation for that word.
 */

public class Word {

    // Default translation for the word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;

    // Image resource ID for the Word variable
    private int mImageResourceID;

    // Audio resource ID for the word
    private int mAudioResourceId;


    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int
                audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceId = audioResourceId;
    }

    // Get the defaultTranslation of the word.
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get the Miwok translation of the word.
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    // Return the audio resource ID of the word.
    public int getAudioResourceId() {
        return mAudioResourceId;
    }



}
