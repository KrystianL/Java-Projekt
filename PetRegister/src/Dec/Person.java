package Dec;

interface Person{
	public String GetData(); // zwraca opis
}
//implementacja normal person bez dekoratorów
class NormalPerson implements Person {
	public String GetData(){
	return "Normal Person";
}

	

}

