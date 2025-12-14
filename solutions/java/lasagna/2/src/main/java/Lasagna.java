public class Lasagna {
    final int TIME_TAKEN_FOR_EACH_LAYER = 2;

    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int t){
        return expectedMinutesInOven()-t;
    }
    public int preparationTimeInMinutes(int layers){
        return layers * TIME_TAKEN_FOR_EACH_LAYER;        
    }

    public int totalTimeInMinutes(int layers, int minutesInOven){
        return preparationTimeInMinutes(layers) +  minutesInOven;
    }
  
}
