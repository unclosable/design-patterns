package structural_patterns.adapter.src;

public class HumanWriterManager implements Writer {

	private Writer writer;

	public HumanWriterManager() {
		this.writer = new HumanWriter();
	}

	@Override
	public void writerBook() {
		this.writer.writerBook();
	}

}
