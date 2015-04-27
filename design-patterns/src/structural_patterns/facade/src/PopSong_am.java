package structural_patterns.facade.src;

public class PopSong_am extends PopSong {

	@Override
	protected void play() {
		System.out.println("absolute music started");

	}

	@Override
	public void running() {
		System.out.println("absolute music running");

	}

	@Override
	public void stop() {
		System.out.println("absolute music stoped");

	}

}
