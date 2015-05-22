package behavioral_patterns.memento.src;

public class Plant {
	private PlantType plantType;
	private Integer hight;
	private Integer weight;

	public Plant(PlantType plantType, int hight, int weight) {
		this.hight = hight;
		this.weight = weight;
		this.plantType = plantType;
	}

	public void timePasses() {
		this.hight *= 8;
		this.weight *= 12;
		switch (this.plantType) {
		case BUD:
			this.plantType = PlantType.SPROUT;
			break;
		case SPROUT:
			this.plantType = PlantType.FRUIT;
			break;
		case FRUIT:
			this.plantType = PlantType.JUNK;
			break;
		case JUNK:
			this.plantType = PlantType.BUD;
			break;
		default:
			break;
		}
	}

	public PlantMemento getMemento() {
		PlantMementoImpl memento = new PlantMementoImpl();
		memento.setHight(hight);
		memento.setWeight(weight);
		memento.setPlantType(plantType);
		return memento;
	}

	public void setMemento(PlantMemento memento) {
		PlantMementoImpl m = (PlantMementoImpl) memento;
		this.hight = m.getHight();
		this.weight = m.getWeight();
		this.plantType = m.getPlantType();
	}

	@Override
	public String toString() {
		return String.format("plant hight: %d weight: %d  type:  %s", hight, weight, plantType.toString());
	}
}
