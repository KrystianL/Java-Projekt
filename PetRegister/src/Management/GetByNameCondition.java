package Management;

import Humans.Human;

public class GetByNameCondition extends Condition<Human>{

	private String name;

	public GetByNameCondition(String name)
	{
		this.name=name;
	}
	@Override
	public boolean check(Human obj) {
		// TODO Auto-generated method stub
		return obj.getName().equalsIgnoreCase(name); //?
	}

}