package com.learn.planetjup.business;

public class Car {

	private String name;
	private Model model;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [ {name=/'" + name + "/', model=/'" + model + "} ]";
	}
}
