package creational_patterns.prototype.src.beanproto;

import creational_patterns.prototype.src.proto.ProtoType;

public abstract class BeanThree extends ProtoType {

	@Override
	public abstract BeanThree clone() throws CloneNotSupportedException;

}
