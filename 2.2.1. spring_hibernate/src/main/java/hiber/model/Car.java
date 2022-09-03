package hiber.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "cars")
public class Car  {

    @Column (name = "model")
    private String model;

    @Id
    @Column (name = "series")
    private int series;



    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }


    @Override
    public String toString() {
        return "Car{" +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
