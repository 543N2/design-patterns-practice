package Builders2;

import Products2.Apartment;

public class ApartmentBuilder implements HouseBuilder {
    public int rooms;
    public int bathrooms;
    public int area;

    @Override
    public HouseBuilder addRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    @Override
    public HouseBuilder addBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
        return this;
    }

    @Override
    public HouseBuilder setArea(int area) {
        this.area = area;
        return this;
    }

    public Apartment get() {
        return new Apartment(this);
    }
}
