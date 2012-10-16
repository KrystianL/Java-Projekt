

package Dec;

public class EyesDekorator extends PersonDekorator{
public EyesDekorator (Person dekorowanyPerson){
super(dekorowanyPerson);
}
public String GetData() {
    return dekorowanyPerson.GetData() + ", and blue eyes";
}
}