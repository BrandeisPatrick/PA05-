package lesson19;
//kyra testing if i can push

public class AllStayAtHome extends Population{

  public AllStayAtHome(int n){
    super(n);
  }

  public void createPeople(){
    for(int i=0; i<this.people.length; i++){
      this.addPerson(new StayAtHome());
    }
  }
}
