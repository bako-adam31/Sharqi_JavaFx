package org.example.sharqi;

//Szarmaztatott osztaly

/**
 * ez az osztaly segit csoportositani a termeket, designer kategoria kulon jon
 */
public class DesignerFragrance extends Parfum {
    public DesignerFragrance(String name, String brand) {
        super(name, brand, "High End");
    }

    @Override
    public String getTypeCategory() {
        return "Designer";
    }
}