package catHouse.entities.cat;

public class LonghairCat extends BaseCat{
    public static final int INITIAL_KILOGRAMS = 9;

    public LonghairCat(String name, String breed, double price) {
        super(name, breed, price);
        super.setKilograms(INITIAL_KILOGRAMS);
    }

    @Override
    public void eating() {
        super.setKilograms(super.getKilograms() + 3);
    }
}
