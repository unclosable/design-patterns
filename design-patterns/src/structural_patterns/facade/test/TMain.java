package structural_patterns.facade.test;

import org.junit.Test;

import structural_patterns.facade.src.SongListen;

public class TMain {
	@Test
	public void t(){
		SongListen songListen=new SongListen();
		songListen.play();
		songListen.running();
		songListen.stop();
	}

}
