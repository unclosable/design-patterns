package creational_patterns.prototype.src.beanproto;

import creational_patterns.prototype.src.proto.ProtoType;

public abstract class BeanTwo extends ProtoType {

	@Override
	public abstract BeanTwo clone() throws CloneNotSupportedException;

}
