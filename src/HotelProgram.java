/**
 * Zadanie 2 - Pokoje hotelowe
 * Napisz program do przechowywania informacji o pokojach hotelowych. Każdy pokój
 * ma numer oraz informacje o tym czy jest zajęty czy wolny.
 *
 * Dodaj kilka pokoi, a następnie je wyświetl.
 */

public class HotelProgram {
    public static void main(String[] args) {

        HotelRoom[] hotelRooms = new HotelRoom[5];  //deklarujemy tablicę obiektów - pokoi hotelowych

        HotelRoom room1 = new HotelRoom();  //deklaracja obiektu room1
        room1.number = 1;
        room1.occupied = true;  //pokój jest obecnie zajęty
        hotelRooms[0] = room1;      //umieszczamy pierwszy pokój w naszej tablicy pokoi hotelowych

        //wyświetlenie informacji o pokoju nr 1
        System.out.println("Informacja o pokojach hotelowych: ");
        System.out.println("Pokój nr: " + room1.number);
        if (room1.occupied == true){
            System.out.println("Pokój jest " + "zajęty.");
        } else {
            System.out.println("PokOj jest dostępny");
        }
        System.out.println("------------------");

        //teraz zadeklarujemy i zainicjujemy pokój hotelowy nr 2
        HotelRoom room2 = new HotelRoom();
        room2.number = 2;
        room2.occupied = false;
        hotelRooms[1] = room2;  //umieszczamy drugi pokój w naszej tablicy pokoi hotelowych

        //wyświetlenie informacji o pokoju nr 2
        System.out.println("Pokój nr: " + room2.number);
        if (room2.occupied == true){
            System.out.println("Pokój jest zajęty.");
        } else {
            System.out.println("Pokój jest dostępny.");
        }

        //teraz zadeklarujemy i zainicjujemy pokój hotelowy nr 3
        HotelRoom room3 = new HotelRoom();
        room3.number = 3;
        room3.occupied = true;
        hotelRooms[2] = room3;  //umieszczamy trzeci pokój w naszej tablicy pokoi hotelowych

        //teraz zadeklarujemy i zainicjujemy pokój hotelowy nr 4
        HotelRoom room4 = new HotelRoom();
        room4.number = 4;
        room4.occupied = false;
        hotelRooms[3] = room4;  //umieszczamy trzeci pokój w naszej tablicy pokoi hotelowych

        //teraz zadeklarujemy i zainicjujemy pokój hotelowy nr 5
        HotelRoom room5 = new HotelRoom();
        room5.number = 5;
        room5.occupied = true;
        hotelRooms[4] = room5;

        //teraz wyświetlimy informacje o wszystkich pokojach
        //hotelowych korzystając z pętli foreach
        for (HotelRoom room : hotelRooms){
            System.out.println("Pokój nr: " + room.number);
            if (room.occupied == true){
                System.out.println("Pokój jest zajęty");
            } else {
                System.out.println("Pokój jest dostępny");
            }
            System.out.println("---------------");
        }
    }
}
