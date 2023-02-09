package L15_exceptions_person;

import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private float weight;
    private LocalDate birthday;
    private Device device;


    public Person(int id, String name, float weight, LocalDate birthday, Device device) throws InvalidIdException, InvalidWeightException {
        setId(id);
        this.name = name;
        setWeight(weight);
        this.birthday = birthday;
        this.device = device;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws InvalidIdException {
        if (id < 0) {
            throw new InvalidIdException("Id must be gtz");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) throws InvalidWeightException {
        if (weight < 0) {
            throw new InvalidWeightException("weigth must be gtz");
        }
        this.weight = weight;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
