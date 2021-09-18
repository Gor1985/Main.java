public class Hotel {
    Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public void getFreeRooms() {
        String freeRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isFree()) freeRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера свободных комнат " + freeRoomsList);
    }


    public void reserveRoom(byte roomNumber) {
        String info = "Такой комнаты не существует";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if (room.getRoomNumber() == roomNumber && room.isFree()) {
                room.setFree(false);
                info = ("Комната номер " + roomNumber + " успешно забронированна");
                break;

            } else if (room.getRoomNumber() == roomNumber && !room.isFree()) {
                info = "Комната " + roomNumber + " занята";
                break;

            }
        }
        System.out.println(info);

    }

    public void noReserv(byte roomNumber) {
        String info = "Эта комната под освобождение?";

        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];

            if (!room.isFree()) {
                room.setFree(true);
                info = ("Комната номер " + roomNumber + " успешно освобождена");
                break;

            }
        }
        System.out.println(info);
    }

    public void wiFi() {

        String freeRoomsList = "";
        for (Room room : rooms) {
            if (room.isWifi()) freeRoomsList += room.getRoomNumber() + ", ";
        }
        System.out.println("Номера комнат с вайфай " + freeRoomsList);

    }

    public void WC() {

        String freeRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isWc()) freeRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера комнат с WC " + freeRoomsList);

    }

    public void EAT() {

        String freeRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isEat()) freeRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера комнат с завтраком " + freeRoomsList);
    }

    public void Sleep() {

        String freeRoomsList = "";
        for (int i = 0; i < rooms.length; i++)

        System.out.println("комната номер: " +rooms[i].getRoomNumber()+" спальных мест: "+rooms[i].getQuantity());
    }
}





