package parser.service.impl;

import parser.models.Apartament;
import parser.models.Room;
import parser.models.Wall;
import parser.service.ISeparateApartamentService;
import parser.service.ISeparateRoomService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SeparateRoomServiceImp implements ISeparateRoomService {

    ISeparateApartamentService apartamentService;
    public SeparateRoomServiceImp()
    {
        apartamentService = new SeparateApartamentServiceImp();
    }

    @Override
    public List<Integer> getRoomCoordinateX(Room room) {
        int beginCord = (int) room.getX();
        List<Integer> coordX = new ArrayList<>();
        List<Wall> wallList = apartamentService.getAllWallFromRoom(room);
        for (Wall wall:wallList) {
            wall.getItems().forEach(v-> coordX.add((int) (v.getX()+beginCord)/10));
        }
        return coordX;
    }

    @Override
    public List<Integer> getRoomCoordinateY(Room room) {
        int beginCoord = (int) room.getY();
        List<Integer> coordY = new ArrayList<>();
        List<Wall> wallList = apartamentService.getAllWallFromRoom(room);
        for (Wall wall:wallList) {
            wall.getItems().forEach(v-> coordY.add((int) (v.getY()+beginCoord)/10));
        }
        return coordY;
    }
}
