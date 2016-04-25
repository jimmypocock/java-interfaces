package com.completeJavaDeveloperCourse;

/**
 * Created by jimmypocock on 4/24/16.
 */
public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered on.");
    }

    @Override
    public void dial(int phoneNubmer) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNubmer + " on mobile phone.");
        } else {
            System.out.println("Phone is switched off.");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering on mobile phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (isOn && (phoneNumber == myNumber)) {
            isRinging = true;
            System.out.println("Ring ring.");
        } else {
            System.out.println("Mobile phone not on or different number.");
            isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
