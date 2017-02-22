package design.pattern.abstract_factory;

public class Customer {
    public void getBMW(String name) throws Exception {
        Class<?> clazz = Class.forName(this.getClass().getPackage().getName() + ".Factory" + name);
        FactoryBMW factoryBMW = (FactoryBMW) clazz.newInstance();
        factoryBMW.buildBMW();
        factoryBMW.buildAirConditioner();
    }

    public static void main(String[] args) throws Exception {
        Customer c = new Customer();
        c.getBMW("BMW320");
        c.getBMW("BMW523");
    }
}
