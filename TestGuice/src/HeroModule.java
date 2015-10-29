import com.google.inject.Binder;
import com.google.inject.Module;

public class HeroModule implements Module {

	@Override
	public void configure(Binder arg0) {
		// TODO Auto-generated method stub
		arg0.bind(Vehicle.class).to(FrogMobile.class);
	}

}
