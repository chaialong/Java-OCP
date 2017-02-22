package design.pattern.abstract_factory;

public class FactoryBMW523 implements FactoryBMW {
    @Override
    public BMW buildBMW() {
        return new BMW523();
    }

    @Override
    public AirConditioner buildAirConditioner() {
        return new AirConditioner523();
    }
}
