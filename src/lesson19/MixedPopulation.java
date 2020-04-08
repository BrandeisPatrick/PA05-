package lesson19;

public class MixedPopulation extends Population{
  int numShelterInPlace;
  int numEssential;
  int numSkeptic;
  int numFreqFlier;

  public MixedPopulation(int numShelterInPlace, int numEssential, int numSkeptic, int numFreqFlier){
    super(numShelterInPlace + numEssential + numSkeptic + numFreqFlier);
    this.numShelterInPlace = numShelterInPlace;
    this.numEssential = numEssential;
    this.numSkeptic = numSkeptic;
    this.numFreqFlier = numFreqFlier;

  }

  public void createPeople(){
    for(int i=0; i<this.numShelterInPlace; i++){
      this.addPerson(new StayAtHome());
    }
    for(int i=0; i<this.numEssential; i++){
      this.addPerson(new StayAtHomeIfSick());
    }
    for(int i=0; i<this.numSkeptic; i++){
      this.addPerson(new Skeptic());
    }
    for(int i=0; i<this.numFreqFlier; i++){
        this.addPerson(new FrequentFlier());
      }
  }
}
