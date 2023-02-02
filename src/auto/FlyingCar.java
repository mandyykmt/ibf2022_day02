package auto;

public class FlyingCar extends Car {

    // Members
    private float altitue = 0f; // f means float

    // Constructor
    public FlyingCar() { }
    public FlyingCar(String registration) {
        this.setRegistration(registration);
    }

    // Getters and setters
    public float getAltitue() { return altitue; }
    public void setAltitue(float altitue) { this.altitue = altitue; }

    // Methods
    public void climb(float feet) {
        if (this.altitue < 100) {
            this.altitue = Math.min(this.altitue + feet, 100f); 
        }
    }

    // default to climb 5ft
    // overloading (same method name but different parameters and different return type)
    public void climb() {
        this.altitue += 5;
    }

    // Annotation
    @Override // this method is overriding the parent (there is a syntax error because cannot find for parent)
    public String getRegistration() {
        // s1234a --> Fs1234a
        return "F" + super.getRegistration(); 
    }

    @Override
    public void start () {
        super.start();
        this.altitue = 5;
    }

    
}
