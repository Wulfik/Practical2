public class SampleFamilyProvider {

    Male Ivan = new Male ("Іван");
    Female Marina = new Female("Марина");
    Male Ostap = new Male("Остап");
    Female Katia = new Female("Катя", Ivan, Marina);
    Female Ira = new Female("Іра", Ivan, Marina);
    Male Igor = new Male ("Ігор");
    Female Olesia = new Female("Олеся", Ostap, Katia);
    Male Yuri = new Male ("Юрій", Ostap, Katia);
    Female Vika = new Female("Віка", Ostap, Katia);
    Male Vasul = new Male("Василь",Igor, Ira );


    public Male makeFamilyTree (){
        return Yuri;
    }
}