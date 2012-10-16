package Dec;
//abstrakcyjna klasa dekorator - implementuje interfejs
abstract class PersonDekorator implements Person {
protected Person dekorowanyPerson;  //dekorowany person

public PersonDekorator( Person dekorowanyPerson) {
	this.dekorowanyPerson = dekorowanyPerson;
}
}
