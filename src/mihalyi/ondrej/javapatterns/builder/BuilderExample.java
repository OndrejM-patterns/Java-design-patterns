package mihalyi.ondrej.javapatterns.builder;

public class BuilderExample {
	public static void main(String[] args) {
		CarToBuild car = new CarToBuild.Builder().color("blue")
				.manufacturer("Ford").brand("T").build();
		System.out.println(car);
	}
}
