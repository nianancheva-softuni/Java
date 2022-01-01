package spaceStation.models.planets;

import java.util.ArrayList;
import java.util.Collection;

import static spaceStation.common.ExceptionMessages.*;

public class PlanetImpl implements Planet{
    private String name;
    private Collection<String> items;

    public PlanetImpl(String name) {
        this.setName(name);
        items = new ArrayList<>();
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(PLANET_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    //    • name – String
    //        ◦ If the name is null or whitespace,
    //        throw a NullPointerException with message: "Invalid name!"
    //    • items – a collection of Strings

    @Override
    public Collection<String> getItems() {
        return items;
    }

    @Override
    public String getName() {
        return name;
    }
}
