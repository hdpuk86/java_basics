public class Bus{
  private int number;
  private Person[] passengers;

  public Bus(int number){
    this.number = number;
    this.passengers = new Person[5];
  }

  public int getNumber(){
    return this.number;
  }

  public int countPassengers(){
    int count = 0;
    for(Person person : passengers){
      if (person != null){
        count++;
      }
    }
    return count;
  }

  public void addPassenger(Person person){
    if(!isBusFull()){
      int passengerCount = countPassengers();
      this.passengers[passengerCount] = person;
    }
  }

  public boolean isBusFull(){
    return countPassengers() == passengers.length;
  }

  public void lastStop(){
    for(int i = 0; i < this.passengers.length; i++){
      this.passengers[i] = null;
    }
  }

}
