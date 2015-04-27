package structural_patterns.facade.src;

public class PopSong_eoe extends PopSong {

	@Override
	protected void play() {
		System.out.println("lyric music started");

	}

	@Override
	public void running() {
		System.out.println("lyric music running");

	}

	@Override
	public void stop() {
		System.out.println("lyric music stoped");

	}

}
