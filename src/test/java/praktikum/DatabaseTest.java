package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Тесты для класса /src/main/java/Database.
 */
public class DatabaseTest {

    private final Database db = new Database();

    @Test
    public void availableListOfBuns() {
        assertFalse(db.availableBuns().isEmpty());
    }

    @Test
    public void availableIngredientsList() {
        assertFalse(db.availableIngredients().isEmpty());
    }
}