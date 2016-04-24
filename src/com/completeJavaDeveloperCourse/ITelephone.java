package com.completeJavaDeveloperCourse;

/**
 * Created by jimmypocock on 4/24/16.
 */
public interface ITelephone {
    void powerOn();
    void dial(int phoneNubmer);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
