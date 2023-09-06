public class abstractDemo {
    abstract class Vehicle{
        private int year;
        private String brand;
        //constructors
        public Vehicle(int year, String brand){
            this.year = year;
            this.brand = brand;
        }

        //Abstract method start() body of code emty
        abstract void  start();
    }
    class MotoCycle extends Vehicle{
        public MotoCycle(int year, String brand){
            super(year,brand);
        }
        void start(){
            //MotoCycle srart
        }
    class car extends Vehicle{
            public car(int year, String brand){
                super(year, brand);
            }
            void start(){
                //Car Start
            }
    }
    }
}
