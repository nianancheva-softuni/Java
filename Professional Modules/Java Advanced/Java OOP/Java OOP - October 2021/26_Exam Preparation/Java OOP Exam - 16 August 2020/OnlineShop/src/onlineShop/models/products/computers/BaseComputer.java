package onlineShop.models.products.computers;

import onlineShop.models.products.BaseProduct;
import onlineShop.models.products.components.Component;
import onlineShop.models.products.peripherals.Peripheral;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseComputer extends BaseProduct implements Computer {
    private List<Component> components;
    private List<Peripheral> peripherals;

    //    • components – List
    //    • peripherals – List

    protected BaseComputer(int id, String manufacturer, String model, double price, double overallPerformance) {
        super(id, manufacturer, model, price, overallPerformance);
        components = new ArrayList<>();
        peripherals = new ArrayList<>();
    }

    @Override
    public List<Component> getComponents() {
        return components;
    }

    @Override
    public List<Peripheral> getPeripherals() {
        return peripherals;
    }

    @Override
    public void addComponent(Component component) {

    }

    @Override
    public Component removeComponent(String componentType) {
        return null;
    }

    @Override
    public void addPeripheral(Peripheral peripheral) {

    }

    @Override
    public Peripheral removePeripheral(String peripheralType) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getOverallPerformance() {

        if (components.isEmpty()) {
            return super.getOverallPerformance();
        } else {
            double componentsSum = 0;
            for (Component component : components) {
                componentsSum += component.getOverallPerformance();
            }
            double componentsAverage = componentsSum / components.size();

            return super.getOverallPerformance() + componentsAverage;
        }

        //Override the base functionality (if the components collection is empty,
        // it should return only the computer overall performance,
        // otherwise return the sum of the computer overall performance
        // and the average overall performance from all components)
    }
}
