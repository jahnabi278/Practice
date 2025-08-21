package com.terra.app.sd.builder;

public class TestBuilder {

	public static void main(String[] args) {

		Computer myComputer = new ComputerBuilder().setCPU("Intel i7").setRAM("16GB").setStorage("512GB SSD").build();

		System.out.println(myComputer);

		CarBuilderWithStaticNestedClass builder = new CarBuilderWithStaticNestedClass.CarBuilder().setColor("Blue")
				.setEngine("V8").setSunroof(false).setWheels(4).build();

		System.out.println(builder);
	}

}
