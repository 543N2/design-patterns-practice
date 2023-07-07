import Builders2.ApartmentBuilder;
import Builders2.CabinBuilder;
import Builders2.HouseBuilder;

public class Director {

    private HouseBuilder builder;

    public Director(){}

    public void buildApartment(ApartmentBuilder builder){
        builder.addRooms(2)
                .addBathrooms(1)
                .setArea(35);
    }

    public void buildCabin(CabinBuilder builder){
        builder.addRooms(3)
                .addBathrooms(2)
                .setArea(100);
    }
}
