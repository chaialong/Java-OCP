package design.pattern.factory_method;

public class FactoryBMW523 implements FactoryBMW {
    @Override
    public BMW buildBMW() {
        return new BMW523();
    }
}
