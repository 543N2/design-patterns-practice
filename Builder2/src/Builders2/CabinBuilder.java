package Builders2;

import Products2.Cabin;

public class CabinBuilder implements HouseBuilder {
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

    public Cabin get(){
        return new Cabin(this);
    }
}
