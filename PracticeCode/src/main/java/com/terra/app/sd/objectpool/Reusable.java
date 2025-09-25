package com.terra.app.sd.objectpool;

import java.util.ArrayList;
import java.util.List;

public class Reusable {
	public void use() {
		System.out.println("Using reusable object");
	}
}

class ObjectPool {

	private List<Reusable> avaiable = new ArrayList<>();
	private List<Reusable> inUsed = new ArrayList<>();

	public Reusable acquires() {
		if (avaiable.isEmpty()) {
			avaiable.add(new Reusable());
		}
		Reusable obj = avaiable.remove(0);
		inUsed.add(obj);
		return obj;
	}

	public void releaseObj(Reusable obj) {
		inUsed.remove(obj);
		avaiable.add(obj);
	}

}