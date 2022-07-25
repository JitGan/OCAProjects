class Car {
    int modelYr;
    String model;
    public Car(){
        modelYr = 0;
        model = "stock";
    }
    public Car(String model, int modelYr){
        this.model = model;
        this.modelYr = modelYr;
    }


public static void main(String[] args) {

    Car honda = new Car("Accord", 2020);
    Car bmw = new Car();
    System.out.println(bmw.model +" "+ bmw.modelYr);
    System.out.println(honda.model +" "+ honda.modelYr);
    }
}