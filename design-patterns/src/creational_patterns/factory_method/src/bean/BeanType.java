package creational_patterns.factory_method.src.bean;

public enum BeanType {

	TYPE_ONE, TYPE_TWO, TYPE_THREE, TYPE_FORE;

	@Override
	public String toString() {
		switch (this) {
		case TYPE_ONE:
			return "type_one";
		case TYPE_TWO:
			return "type_two";
		case TYPE_THREE:
			return "type_three";
		case TYPE_FORE:
			return "type_fore";

		default:
			return "error_type";
		}
	}
}
