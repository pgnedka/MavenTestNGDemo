package org.nedka;

import org.testng.annotations.Test;

public class RegistrationTest {

    //Page URL
    String PAGE_URL_REGISTRATION = "http://training.skillo-bg.com:4300/users/register";

    //Element Selection

    String USERNAME_INPUT_FIELD_XPATH = "//input[contains(@placeholder,\"Username\")]";

    @Test

    public void newRegistrationTest (){
        System.out.println("User is successfully registered");
    }

    public void clickOn() {
        //
    }
}