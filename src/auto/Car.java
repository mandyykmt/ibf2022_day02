package auto;

public class Car {

    // members
    private String registration;
    private String make;
    private boolean started = false;
    private int counter = 0;

    public String comments;

    // constructor (special method that is called once only)
    public Car () { } // notice the constructor here doesn't have anything ("get")
    // read only can generate get only
    // input only can generate set only

    // getters/setters (for every property we have a pair of get and set)
    // don't need setStarted because there are two ways (based on the below code) 
    // so prevalent there's a function
    public String getRegistration() {return registration;}
    public void setRegistration(String registration) {this.registration = registration;} // "this" means myself, me

    public String getMake() {return make;}
    public void setMake(String make) {this.make = make;}

    public boolean isStarted() {return started;}
    public void setStarted(boolean started) {
        if (this.started) {
            this.start();
        } else {
            this.stop();
        }
    }

    // methods 
    public void start () {
        if (this.started) {
            System.out.println("Car is running");
        } else {
            this.started = true;
            this.counter++;
            System.out.println("Vroom! Vroom! Vroom!");
        }
    }

    public void stop() {
        if (!this.started) {
            System.out.println("The car is not running");
        } else {
            this.started = false;
            System.out.println("Splutter splutter stop"); 
        }
    }

    public boolean needToService() {
        return this.counter > 5; 
    }

    public void serviceCar () {
        System.out.println("Servicing car");
        this.counter = 0;
    }
}