package pddadapter.client;

import pddadapter.adapter.Adapter;
import pddadapter.iadapter.ITarget;
import pddadapter.oldclass.Adaptee;

/*
 * Patrón de diseño Adapter - Símple..
 * Referencia: C# 3.0 Desing Patterns
 */
public class Client {

	public static void main(String[] args) {
		
		Adaptee first = new Adaptee();
		System.out.println("Before the new standard\nPrecise reading: ");
		System.out.println(first.specificRequest(5, 3));
		
		ITarget second = new Adapter();
		System.out.println("\nMoving to the new standard");
		System.out.println(second.request(5));
		
	}

}
