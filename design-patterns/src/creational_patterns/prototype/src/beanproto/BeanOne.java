package creational_patterns.prototype.src.beanproto;

import creational_patterns.prototype.src.proto.ProtoType;

public abstract class BeanOne extends ProtoType {

	@Override
	public abstract BeanOne clone() throws CloneNotSupportedException;
}
