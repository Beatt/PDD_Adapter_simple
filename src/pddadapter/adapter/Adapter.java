package pddadapter.adapter;

import pddadapter.iadapter.ITarget;
import pddadapter.oldclass.Adaptee;

public class Adapter extends Adaptee implements ITarget {

	@Override
	public String request(int i) {
		return "Rough estimate is " + (int) Math.rint(specificRequest(i, 3));
	}
	
}
