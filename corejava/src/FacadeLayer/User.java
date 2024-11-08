package FacadeLayer;

public class User {
	public static void main(String[] args) {
		RoomLight rm = new RoomLight();
		
		soundSystem sound = new soundSystem();
		
		Television tv = new Television();
		
		HomeThereaterFacade homeThreater = new HomeThereaterFacade(tv,sound,rm);
		
	}
		
				
	

}
