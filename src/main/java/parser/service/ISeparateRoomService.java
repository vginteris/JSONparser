package parser.service;

import parser.models.Apartament;
import parser.models.Room;

import java.util.List;

public interface ISeparateRoomService {
    public List<Integer> getRoomCoordinateX(Room room);
    public List<Integer> getRoomCoordinateY(Room room);
}
