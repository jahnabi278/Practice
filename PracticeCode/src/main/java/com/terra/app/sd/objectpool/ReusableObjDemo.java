package com.terra.app.sd.objectpool;

public class ReusableObjDemo {

	public static void main(String[] args) {
		ObjectPool pool = new ObjectPool();
		Reusable reusableObj = pool.acquires();
		reusableObj.use();
		pool.releaseObj(reusableObj);

	}

}