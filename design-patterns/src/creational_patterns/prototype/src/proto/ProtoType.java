package creational_patterns.prototype.src.proto;

public abstract class ProtoType implements Cloneable {

	@Override
	public abstract Object clone() throws CloneNotSupportedException;
}
