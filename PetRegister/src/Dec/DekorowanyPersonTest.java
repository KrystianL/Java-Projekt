package Dec;


public class DekorowanyPersonTest {
	public static void main(String[] args) {
		Person dekorowanyPerson = new EyesDekorator(
                new HairDekorator(new NormalPerson()));
		System.out.println(dekorowanyPerson.GetData());
	}
}
