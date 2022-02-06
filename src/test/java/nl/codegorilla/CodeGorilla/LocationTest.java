package nl.codegorilla.CodeGorilla;

import nl.codegorilla.CodeGorilla.model.Location;

class LocationTest {

    void testGetCountry() {
        Location location = new Location("Netherlands", "Vianen");

    }

    void testGetCity() {
        Location location = new Location("Netherlands", "Vianen");

    }

    void testGetCountry_null() {
        Location location = new Location(null, "Vianen");

    }

    void testGetCity_null() {
        Location location = new Location("Netherlands", null);

    }

}
