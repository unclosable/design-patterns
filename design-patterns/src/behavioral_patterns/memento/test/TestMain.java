package behavioral_patterns.memento.test;

import java.util.Stack;

import org.junit.Test;

import behavioral_patterns.memento.src.Plant;
import behavioral_patterns.memento.src.PlantMemento;
import behavioral_patterns.memento.src.PlantType;

public class TestMain {
	@Test
	public void tttt() {
		Plant plant = new Plant(PlantType.BUD, 2, 3);
		Stack<PlantMemento> stack = new Stack<PlantMemento>();
		stack.push(plant.getMemento());
		System.out.println(plant);
		plant.timePasses();
		stack.push(plant.getMemento());
		System.out.println(plant);
		plant.timePasses();
		stack.push(plant.getMemento());
		System.out.println(plant);
		plant.timePasses();
		stack.push(plant.getMemento());
		System.out.println(plant);
		while (stack.size() > 0) {
			plant.setMemento(stack.pop());
			System.out.println(plant);
		}
	}

}
