package Products2;

import Builders2.ApartmentBuilder;

import javax.management.MBeanAttributeInfo;

public class Apartment {
    private int rooms;
    private int bathrooms;
    private int area;

    public Apartment(ApartmentBuilder apartmentBuilder) {
        this.rooms = apartmentBuilder.rooms;
        this.bathrooms = apartmentBuilder.bathrooms;
        this.area = apartmentBuilder.area;
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
        System.out.println("Products2.Apartment{" + "rooms=" + rooms + ", bathrooms=" + bathrooms + ", area=" + area + '}');
    }
}
