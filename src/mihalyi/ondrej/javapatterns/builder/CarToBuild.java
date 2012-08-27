package mihalyi.ondrej.javapatterns.builder;

public class CarToBuild {
	private String color;
	private String manufacturer;
	private String brand;

	public static class Builder {
		CarToBuild carToBuild = new CarToBuild();

		public Builder color(String color) {
			carToBuild.color = color;
			return this;
		}

		public Builder manufacturer(String manufacturer) {
			carToBuild.manufacturer = manufacturer;
			return this;
		}

		public Builder brand(String brand) {
			carToBuild.brand = brand;
			return this;
		}

		public CarToBuild build() {
			carToBuild.postConstruct();
			return carToBuild;
		}
	}

	private void postConstruct() {
		// TODO Initialization after attributes set by Builder.build()
		
	}

	@Override
	public String toString() {
		return "Car built [color=" + color + ", manufacturer=" + manufacturer
				+ ", brand=" + brand + "]";
	}
}
