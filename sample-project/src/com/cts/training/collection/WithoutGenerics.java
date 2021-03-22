package com.cts.training.collection;

public class WithoutGenerics {

	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

        public static void main(String args[]){
		WithoutGenerics type = new WithoutGenerics();
		type.set("Pankaj"); 
		type.set(100);
		String str = (String) type.get(); //type casting, error prone and can cause ClassCastException
	}
}