package lesson19;
//Minor Changes to add new classes of people including Skeptic, FreqFlier, and Compromised
public class MixedPopulation extends Population{
  int numShelterInPlace;
  int numEssential;
  int numSkeptic;
  int numFreqFlier;
  int numCompromised;

  public MixedPopulation(int numShelterInPlace, int numEssential, int numSkeptic, int numFreqFlier, int numCompromised){
    //Types of People in Population increased so more int variables were added in
    super(numShelterInPlace + numEssential + numSkeptic + numFreqFlier +  numCompromised);
    this.numShelterInPlace = numShelterInPlace;
    this.numEssential = numEssential;
    this.numSkeptic = numSkeptic;
    this.numFreqFlier = numFreqFlier;
    this.numCompromised = numCompromised;

  }
  
//Creates different classes for different people
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
    for(int i=0; i<this.numCompromised; i++){
        this.addPerson(new Compromised());
      }
  }
}
