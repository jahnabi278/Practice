package com.terra.app.sd.builder;

public class TestBuilder {

	public static void main(String[] args) {

		Computer myComputer = new ComputerBuilder()
				.setCPU("Intel i7")
				.setRAM("16GB")
				.setStorage("512GB SSD")
				.build();

		System.out.println(myComputer);

	}

}
