package structural_patterns.facade.src;

import java.util.ArrayList;
import java.util.List;

public class SongListen {
	
	private List<PopSong> popSongs;
	
	public SongListen(){
		this.popSongs=new ArrayList<>();
		this.popSongs.add(new PopSong_rock());
		this.popSongs.add(new PopSong_am());
		this.popSongs.add(new PopSong_eoe());
	}
	
	public void play(){
		for (PopSong popSong:this.popSongs){
			popSong.Songplay();
		}
	}
	public void running(){
		for (PopSong popSong:this.popSongs){
			popSong.running();
		}
	}
	public void stop(){
		for (PopSong popSong:this.popSongs){
			popSong.stop();
		}
	}

}
