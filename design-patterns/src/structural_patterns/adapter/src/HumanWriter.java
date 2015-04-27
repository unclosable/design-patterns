package structural_patterns.adapter.src;

public class HumanWriter implements Writer {
	private Pen pen;

	public HumanWriter() {
		this.pen = new Pen();
	}

	@Override
	public void writerBook() {
		this.pen.drawing();
		this.pen.write();
		this.pen.eat();
	}

}
