package web.model;

public class Car {
    private String model;
    private int series;
    private boolean ofroad;

    public Car() {}

    public Car (String model, int series, boolean ofroad) {
        this.model = model;
        this.series = series;
        this.ofroad = ofroad;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public boolean getOfroad() {
        return ofroad;
    }
}