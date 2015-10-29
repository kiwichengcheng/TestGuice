import com.google.inject.Guice;
import com.google.inject.Injector;

public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Injector injector = Guice.createInjector(new HeroModule());
		FrogMan hero = injector.getInstance(FrogMan.class);
		hero.fightCrime();
	}

}
