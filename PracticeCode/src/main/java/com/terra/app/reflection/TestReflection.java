package com.terra.app.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class TestReflection {
	public static void main(String[] args) throws BaseException {
		try {
			Class cls = Class.forName("com.terra.app.reflection.Employee");
			System.out.println("Class name : " + cls.getSimpleName());

			// Constructor creation
			Constructor[] constructors = cls.getDeclaredConstructors();
			for (Constructor c : constructors) {
				System.out.println();
				System.out.println("Constructor : " + c.toGenericString());

				System.out.println();
				System.out.println("Parameters ----------------------");

				Parameter[] params = c.getParameters();
				for (Parameter p : params) {
					System.out.println(p.getName());
				}

			}
			System.out.println("Annotations :   ");
			Annotation[] annos = cls.getDeclaredAnnotations();
			for (Annotation ano : annos) {
				System.out.println("Annotation : " + ano);
			}

			System.out.println();
			System.out.println("Methods ----------------------");
			Method[] methods = cls.getDeclaredMethods();
			for (Method m : methods) {
				System.out.println();

				System.out.println("Method names : " + m.getName());
				System.out.println("Method ReturnType : " + m.getReturnType());
				System.out.println("Method Parameter count : " + m.getParameterCount());
			}

		} catch (ClassNotFoundException e) {
			throw new BaseException(e);
		}
	}

}
