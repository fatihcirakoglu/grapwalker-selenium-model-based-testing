// Generated by GraphWalker (http://www.graphwalker.org)
package com.company;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "com/company/PazaramaAddShoppingCart.json")
public interface PazaramaSearchItem {

    @Vertex()
    void v_WriteItemNameInSearchBar();

    @Edge()
    void e_VerifySearchedItem();

    @Vertex()
    void v_Start();

    @Edge()
    void e_GoToHomePage();

    @Vertex()
    void v_VerifySearch();

    @Edge()
    void e_ClickSearchButton();
}