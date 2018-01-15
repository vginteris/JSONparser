package parser.service.impl;

import parser.models.*;
import parser.service.ISeparateApartamentService;

import java.util.ArrayList;
import java.util.List;

public class SeparateApartamentServiceImp implements ISeparateApartamentService {
    @Override
    public List<Floor> getAllFloor(Apartament apartament) {
        List<Floor> floorList = new ArrayList<>();
        apartament.getData().getItems().forEach(v -> floorList.add(v));
        return floorList;
    }

    @Override
    public List<Room> getAllRoomsFromFloor(Floor floor) {
        List<Room> roomList = new ArrayList<>();
        floor.getItems().forEach(v -> roomList.add(v));
        return roomList;
    }

    @Override
    public List<Wall> getAllWallFromRoom(Room room) {
        List<Wall> wallList = new ArrayList<>();
        room.getItems().forEach(v -> wallList.add(v));
        return wallList;
    }

    @Override
    public List<Point> getAllPointFromWall(Wall wall) {
        List<Point> pointList = new ArrayList<>();
        wall.getItems().forEach(v -> pointList.add(v));
        return pointList;
    }

}
