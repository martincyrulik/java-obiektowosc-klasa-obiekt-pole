/**
 * Napisz program do przechowywania informacji o dowolnie wybranych elementach.
 * Określ ich właściwości (pola).
 *
 * Dodaj kilka elementów, a następnie je wyświetl.
 */

public class CarProgram {
    public static void main(String[] args) {

        Car[] cars = new Car[4];    //tworzymy tablicę 4 obiektów - samochodów

        //implementacja pierwszego obiektu clasy Car
        Car car01 = new Car();
        car01.brand = "Volkswagen";
        car01.model = "Polo V";
        car01.type = "hatchback";
        car01.engine = "1.4 TSI";
        car01.horsePower = 170;
        car01.productionYear = 2006;
        car01.price = 5000;
        car01.newCar = false;
        char[] color01 = {'r','e','d'};
        car01.color = color01;
        cars[0] = car01;

        //wyświetlenie danych pierwszego samochodu
        System.out.println("----------1 samochód-----------");
        System.out.println("Marka: " + car01.brand);
        System.out.println("Model: " + car01.model);
        System.out.println("Typ: " + car01.type);
        System.out.print("Silnik: " + car01.engine);
        System.out.println(" " + car01.horsePower + " KM");
        System.out.println("Rok produkcji: " + car01.productionYear);
        System.out.println("Cena: " + car01.price + " "+ "$");
        if (car01.newCar == true){
            System.out.println("Samochód jest: nowy");
        } else {
            System.out.println("Samochód jest: używany");
        }
        System.out.print("Kolor: ");
        for (char c : color01){
            System.out.print(c);
        }
        System.out.println();

        //implementacja drugiego obiektu clasy Car
        Car car02 = new Car();
        car02.brand = "BMW";
        car02.model = "X2 F39";
        car02.type = "Crossover";
        car02.engine = "2.0 20i";
        car02.horsePower = 178;
        car02.productionYear = 2020;
        car02.price = 25000;
        car02.newCar = false;
        char[] color02 = {'b','l','u','e'};
        car02.color = color02;
        cars[1] = car02;

        //wyświetlenie danych drugiego samochodu
        System.out.println("----------2 samochód-----------");
        System.out.println("Marka: " + car02.brand);
        System.out.println("Model: " + car02.model);
        System.out.println("Typ: " + car02.type);
        System.out.print("Silnik: " + car02.engine);
        System.out.println(" " + car02.horsePower + " KM");
        System.out.println("Rok produkcji: " + car02.productionYear);
        System.out.println("Cena: " + car02.price + " "+ "$");
        if (car02.newCar == true){
            System.out.println("Samochód jest: nowy");
        } else {
            System.out.println("Samochód jest: używany");
        }
        System.out.print("Kolor: ");
        for (char c : color02){
            System.out.print(c);
        }
        System.out.println();

        //implementacja trzeciego obiektu clasy Car
        Car car03 = new Car();
        car03.brand = "Skoda";
        car03.model = "Octavia III";
        car03.type = "Liftback";
        car03.engine = "2.0 TDI";
        car03.horsePower = 184;
        car03.productionYear = 2015;
        car03.price = 10000;
        car03.newCar = false;
        char[] color03 = {'g','r','e','e','n'};
        car03.color = color03;
        cars[2] = car03;

        //implementacja czwartego obiektu clasy Car
        Car car04 = new Car();
        car04.brand = "Ford";
        car04.model = "Focus IV Active";
        car04.type = "Kombi Facelifting";
        car04.engine = "EcoBoost MHEV";
        car04.horsePower = 155;
        car04.productionYear = 2025;
        car04.price = 40000;
        car04.newCar = true;
        char[] color04 = {'b','l','a','c','k'};
        car04.color = color04;
        cars[3] = car04;

        //wyświetlenie wszystkich samochodów z użyciem pętli foreach
        System.out.println();
        int licznik = 1;
        System.out.println("-----Wyświetlenie listy samochodów przy użyciu pętli foreach----");
        for (Car car : cars){
            System.out.println("----------" + licznik + " samochód-----------");
            System.out.println("Marka: " + car.brand);
            System.out.println("Model: " + car.model);
            System.out.println("Typ: " + car.type);
            System.out.print("Silnik: " + car.engine);
            System.out.println(" " + car.horsePower + " KM");
            System.out.println("Rok produkcji: " + car.productionYear);
            System.out.println("Cena: " + car.price + " "+ "$");
            if (car.newCar == true){
                System.out.println("Samochód jest: nowy");
            } else {
                System.out.println("Samochód jest: używany");
            }
            System.out.print("Kolor: ");
            for (char c : color01){
                System.out.print(c);
            }
            System.out.println();
            licznik++;
        }
    }
}
