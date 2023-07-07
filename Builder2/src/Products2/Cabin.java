package Products2;

import Builders2.CabinBuilder;

import javax.management.MBeanAttributeInfo;

public class Cabin {
    private int rooms;
    private int bathrooms;
    private int area;

    public Cabin(CabinBuilder cabinBuilder) {
        this.rooms = cabinBuilder.rooms;
        this.bathrooms = cabinBuilder.bathrooms;
        this.area = cabinBuilder.area;
    }

    public int getRooms() {
        return rooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getArea() {
        return area;
    }

    public void describe() {
        System.out.println("Products2.Cabin{" + "rooms=" + rooms + ", bathrooms=" + bathrooms + ", area=" + area + '}');
    }
}
