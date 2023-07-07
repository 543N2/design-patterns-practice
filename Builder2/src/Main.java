import Builders2.ApartmentBuilder;
import Builders2.CabinBuilder;
import Products2.Apartment;
import Products2.Cabin;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        CabinBuilder cabinBuilder = new CabinBuilder();
        director.buildCabin(cabinBuilder);
        Cabin cabin = cabinBuilder.get();
        cabin.describe();

        ApartmentBuilder apartmentBuilder = new ApartmentBuilder();
        director.buildApartment(apartmentBuilder);
        Apartment apartment = apartmentBuilder.get();
        apartment.describe();

    }
}