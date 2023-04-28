package example3_abstract_factory.car;

public interface Factory {
      Car buildBMW(BMWModel bmw);
      Car buildFord(FordModel ford);

}
