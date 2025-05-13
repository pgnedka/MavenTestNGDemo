package org.nedka;

import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void verifyUserTestLogin(){
        System.out.println("User can log in");
    }

    @Test
    public void verifyUserCanNotLoginWithWrongPassword(){
        System.out.println("User can't log in");
    }

    @Test
    public void verifyErrorWhenUserProvideWrongUserName(){
        System.out.println("User can't log in");
    }

}
