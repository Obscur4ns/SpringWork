package com.bae.data;

import java.util.ArrayList;
import java.util.List;

public class JDMicon {

	private List<JDMicon> icon = new ArrayList<>();

	private String model;
	private String colour;
	private boolean turbo;
	private int id;

	public JDMicon(String model, String colour, boolean turbo, int id) {
		super();
		this.model = model;
		this.colour = colour;
		this.turbo = turbo;
		this.id = id;
	}

	public JDMicon() {

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}

	@Override
	public String toString() {
		return "Icon [model = " + model + ", colour = " + colour + ", turbo = " + turbo + "]";

	}

	public List<JDMicon> getIcon() {
		return icon;
	}

	public void setIcon(List<JDMicon> icon) {
		this.icon = icon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
