public class Lasagna {
    final int TIME_TAKEN_FOR_EACH_LAYER = 2;
    // TODO: define the 'expectedMinutesInOven()' method
      public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int t){
        return expectedMinutesInOven()-t;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers * TIME_TAKEN_FOR_EACH_LAYER;        
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesInOven){
        return layers*TIME_TAKEN_FOR_EACH_LAYER +  minutesInOven;
    }
  
}
