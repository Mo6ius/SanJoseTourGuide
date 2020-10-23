package com.example.android.sanjosetourguide;

/**
 * {@link Choice} represents an option for the user to choose.
 * It contains the name of the establishment, an address, and an image for that establishment.
 */
public class Choice {

    /**
     * String resource ID for the name of the establishment
     */
    private int mName;

    /**
     * String resource ID for the address of the establishment
     */
    private int mAddress;

    /**
     * Image resource ID for the establishment
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this establishment
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Choice object.
     *
     * @param name    is the string resource ID for the establishment
     * @param address is the string resource Id for the address of the establishment
     */
    public Choice(int name, int address) {
        mName = name;
        mAddress = address;
    }

    /**
     * Create a new Choice object.
     *
     * @param name            is the string resource ID for the establishment
     * @param address         is the string resource Id for the address of the establishment
     * @param imageResourceId is the drawable resource ID for the image associated with the establishment
     */
    public Choice(int name, int address, int imageResourceId) {
        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the name of the establishment.
     */
    public int getName() {
        return mName;
    }

    /**
     * Get string resource ID for the address of the establishment.
     */
    public int getAddress() {
        return mAddress;
    }

    /**
     * Return the image resource ID of the establishment.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this establishment.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}