package parser.service;

import parser.models.Apartament;
import parser.models.Room;

import java.awt.*;

public interface IGraphicService {
    public Apartament getApartament();
    public Polygon setCoordinateToPolygon(Room room);
}
