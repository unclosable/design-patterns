package structural_patterns.facade.src;

public abstract class PopSong {
	
	protected void init_play(){
		System.out.print("PopSong play:");
	}
	
	public void Songplay(){
		this.init_play();
		this.play();
	}
	
	protected abstract void play();
	
	public abstract void running();
	
	public abstract void stop();

}
