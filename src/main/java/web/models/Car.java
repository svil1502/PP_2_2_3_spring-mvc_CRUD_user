package web.models;

public class Car {
    private int id;
    private String model;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", serias=" + serias +
                '}';
    }

    public Car(int id, String model, int serias) {
        this.id = id;
        this.model = model;
        this.serias = serias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerias() {
        return serias;
    }

    public void setSerias(int serias) {
        this.serias = serias;
    }

    private int serias;

}
