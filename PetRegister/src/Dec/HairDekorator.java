package Dec;

public class HairDekorator extends PersonDekorator{
public HairDekorator (Person dekorowanyPerson){
super(dekorowanyPerson);
}
public String GetData() {
    return dekorowanyPerson.GetData() + ", with long hair";
}
}