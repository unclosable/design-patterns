package structural_patterns.facade.src;

public class PopSong_rock extends PopSong {

	@Override
	protected void play() {
		System.out.println("rocksong started");

	}

	@Override
	public void running() {
		System.out.println("rocksong running");

	}

	@Override
	public void stop() {
		System.out.println("rocksong stoped");

	}

}
