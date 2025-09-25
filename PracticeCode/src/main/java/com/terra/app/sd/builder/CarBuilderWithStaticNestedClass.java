package com.terra.app.sd.builder;

public class CarBuilderWithStaticNestedClass {

	// Instance variables of the Car class
	private String engine;
	private int wheels;
	private String color;
	private boolean sunroof;

	// Private constructor to force use of Builder
	private CarBuilderWithStaticNestedClass(CarBuilder carBuilder) {
		this.engine = carBuilder.engine;
		this.wheels = carBuilder.wheels;
		this.color = carBuilder.color;
		this.sunroof = carBuilder.sunroof;
	}

	// Static nested Builder class
	static class CarBuilder {

		private String engine;
		private int wheels;
		private String color;
		private boolean sunroof;

		public CarBuilder setEngine(String engine) {
			this.engine = engine;
			return this;
		}

		public CarBuilder setWheels(int wheels) {
			this.wheels = wheels;
			return this;
		}

		public CarBuilder setColor(String color) {
			this.color = color;
			return this;
		}

		public CarBuilder setSunroof(boolean sunroof) {
			this.sunroof = sunroof;
			return this;
		}

		public CarBuilderWithStaticNestedClass build() {
			return new CarBuilderWithStaticNestedClass(this);
		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CarBuilder [engine=").append(engine).append(", wheels=").append(wheels).append(", color=")
				.append(color).append(", sunroof=").append(sunroof).append("]");
		return builder.toString();
	}

}
