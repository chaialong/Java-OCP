package design.pattern.abstract_factory;

public class FactoryBMW320 implements FactoryBMW {
    @Override
    public BMW buildBMW() {
        return new BMW320();
    }

    @Override
    public AirConditioner buildAirConditioner() {
        return new AirConditioner320();
    }
}
