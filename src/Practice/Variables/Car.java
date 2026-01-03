package Practice.Variables;

class Cars {
    public String nameOfCar;
    public int ageOfCar;

    public Cars(String nameOfCar, int ageOfCar) {
        this.nameOfCar = nameOfCar;
        this.ageOfCar = ageOfCar;
    }
//    public Cars(String nameOfCar, int ageOfCar) {
//        this.nameOfCar = nameOfCar;
//        this.ageOfCar = ageOfCar;
//    }

    public void getInfo() {
        System.out.println(nameOfCar);
        System.out.println(ageOfCar);
    }

    public static void main(String[] args) {

        Cars cars = new Cars("audi", 21);
        System.out.println(cars.ageOfCar + " : " + cars.nameOfCar);
    }
}


