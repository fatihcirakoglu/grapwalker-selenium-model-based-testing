// Generated by GraphWalker (http://www.graphwalker.org)
package com.company;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "com/company/PazaramaAddShoppingCart.json")
public interface PazaramaLoginLogout {

    @Vertex()
    void v_VerifyHomePageForCustomer();

    @Edge()
    void e_GoToLogoutPage();

    @Edge()
    void e_GoToLoginPageFromLogoutPage();

    @Vertex()
    void v_Start();

    @Vertex()
    void v_VerifyLogoutPage();

    @Edge()
    void e_GoToHomePageForCustomer();

    @Vertex()
    void v_LoginPage();

    @Edge()
    void e_GoToLoginPage();
}
