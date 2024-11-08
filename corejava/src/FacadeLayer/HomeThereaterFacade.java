package FacadeLayer;

public class HomeThereaterFacade {
	Television tv;
	soundSystem sound;
	RoomLight rl;
	
	public HomeThereaterFacade(Television tv,soundSystem sound,RoomLight rl) {
		this.tv =tv;
		this.sound =sound; 
		this.rl =rl;
		
	}
	public void watchMove() {
		tv.switchON();
		sound.soundon();
		rl.lightoff();
		
	}
	public void stopwatching() {
		rl.lightOn();
		sound.soundOff();
		tv.switchoff();
		
	}
	
	

}
