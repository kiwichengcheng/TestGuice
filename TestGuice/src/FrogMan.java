import com.google.inject.Inject;

public class FrogMan {
	private Vehicle vehicle;
	
	@Inject
	public FrogMan(Vehicle vehicle){
		this.vehicle = vehicle;
	}
}
