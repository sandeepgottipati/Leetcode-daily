class Solution {
    class Car{
        int distanceFromTarget;
        int speed;
        double time;
        public Car(int t,int speed,double time){
            distanceFromTarget=t;
            this.speed=speed;
            this.time=time;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        Car[] cars=new Car[position.length];
        for(int i=0;i<position.length;i++){
            double time=(double)((target-position[i])/(double)speed[i]);
            cars[i]=new Car(target-position[i],speed[i],time);
        }
        
        Arrays.sort(cars,new Comparator<Car>(){
            @Override
          public int compare(Car carOne,Car carTwo){
              return carOne.distanceFromTarget-carTwo.distanceFromTarget;
          }  
        }
        );
        int carFleets=0;
        double prevTime=0.0;
        for(int i=0;i<position.length;i++){
            if(cars[i].time>prevTime){
                carFleets++;
                prevTime=cars[i].time;
            }
        }
        return carFleets;
    }
}