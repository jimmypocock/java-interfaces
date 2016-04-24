package com.completeJavaDeveloperCourse;

public class Main {

    public static void main(String[] args) {
	    ITelephone jimmysPhone;
        jimmysPhone = new DeskPhone(713828);
        jimmysPhone.powerOn();
        jimmysPhone.callPhone(828132);
        jimmysPhone.answer();
    }
}
