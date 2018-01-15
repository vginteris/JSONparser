package parser.service;

import parser.models.*;

import java.util.List;

public interface ISeparateApartamentService {

    public List<Floor> getAllFloor(Apartament apartament);
    public List<Room> getAllRoomsFromFloor(Floor floor);
    public List<Wall> getAllWallFromRoom(Room room);
    public List<Point> getAllPointFromWall(Wall wall);
}
