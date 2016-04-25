package com.completeJavaDeveloperCourse;

public class Main {

    public static void main(String[] args) {
	    ITelephone jimmysPhone;
        jimmysPhone = new DeskPhone(713828);
        jimmysPhone.powerOn();
        jimmysPhone.callPhone(713828);
        jimmysPhone.answer();

        jimmysPhone = new MobilePhone(713828);
         jimmysPhone.powerOn();
        jimmysPhone.callPhone(713828);
        jimmysPhone.answer();
    }
}
