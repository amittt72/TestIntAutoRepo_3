package BaseFunctionality;

import PageObjects.LoginPage;
import PageObjects.SomeOtherPage_1;
import PageObjects.SomeOtherPage_2;

public interface POJOParent {
    LoginPage getLoginPage();
    SomeOtherPage_1 getSomeOtherPage1();
    SomeOtherPage_2 getSomeOtherPage2();
}
