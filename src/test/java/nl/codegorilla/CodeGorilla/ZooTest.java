package nl.codegorilla.CodeGorilla;

import nl.codegorilla.CodeGorilla.model.Location;
import nl.codegorilla.CodeGorilla.model.Zoo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ZooTest {

    @Test
    void testGetName() {
        Location location = new Location("Netherlands", "Amsterdam");
        Zoo zoo = new Zoo("Artis", location);

        Assertions.assertEquals("Artis", zoo.getName());
    }

    @Test
    void testGetLocation_getCountry() {
        Location location = new Location("Netherlands", "Amsterdam");
        Zoo zoo = new Zoo("Artis", location);

        Assertions.assertEquals("Netherlands", zoo.getLocation().getCountry());
    }

    @Test
    void testGetLocation_getCity() {
        Location location = new Location("Netherlands", "Amsterdam");
        Zoo zoo = new Zoo("Artis", location);

        Assertions.assertEquals("Amsterdam", zoo.getLocation().getCity());
    }
}
