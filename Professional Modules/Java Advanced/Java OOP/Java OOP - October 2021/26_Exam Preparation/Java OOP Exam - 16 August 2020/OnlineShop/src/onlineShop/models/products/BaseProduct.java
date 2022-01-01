package onlineShop.models.products;

import static onlineShop.common.constants.ExceptionMessages.*;

public abstract class BaseProduct implements Product{
    private int id;
    private String manufacturer;
    private String model;
    private double price;
    private double overallPerformance;

    protected BaseProduct(int id, String manufacturer, String model, double price, double overallPerformance) {
        this.setId(id);
        this.setManufacturer(manufacturer);
        this.setModel(model);
        this.setPrice(price);
        this.setOverallPerformance(overallPerformance);
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException(INVALID_PRODUCT_ID);
        }
        this.id = id;
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer == null || manufacturer.trim().isEmpty()) {
            throw new IllegalArgumentException(INVALID_MANUFACTURER);
        }
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException(INVALID_MODEL);
        }
        this.model = model;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException(INVALID_PRICE);
        }
        this.price = price;
    }

    public void setOverallPerformance(double overallPerformance) {
        if (overallPerformance <= 0) {
            throw new IllegalArgumentException(INVALID_OVERALL_PERFORMANCE);
        }
        this.overallPerformance = overallPerformance;
    }

    //    • id – int
    //        ◦ cannot be less than or equal to 0. In that case,
    //        throw IllegalArgumentException with message "Id can not be less or equal than 0."
    //    • manufacturer – String
    //        ◦ cannot be null or whitespace. In that case,
    //        throw IllegalArgumentException with message "Manufacturer can not be empty."
    //    • model – String
    //        ◦ cannot be null or whitespace. In that case,
    //        throw IllegalArgumentException with message "Model can not be empty."
    //    • price – double
    //        ◦ cannot be less than or equal to 0. In that case,
    //        throw IllegalArgumentException with message "Price can not be less or equal than 0."
    //    • overallPerformance – double
    //        ◦ cannot be less than or equal to 0. In that case,
    //        throw IllegalArgumentException with message "Overall Performance can not be less or equal than 0."

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getOverallPerformance() {
        return overallPerformance;
    }

    @Override
    public String toString() {
        return "BaseProduct{}";
    }
}
