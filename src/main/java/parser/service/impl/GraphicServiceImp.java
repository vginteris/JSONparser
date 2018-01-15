package parser.service.impl;

import parser.models.Apartament;
import parser.models.Room;
import parser.service.IConverterJsonService;
import parser.service.IFileService;
import parser.service.IGraphicService;
import parser.service.ISeparateRoomService;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class GraphicServiceImp implements IGraphicService {
    @Override
    public Apartament getApartament() {
        IFileService fileservice = new FileServiceImp();
        String roomJson = null;
        try {
            roomJson = fileservice.getFileContent();
        } catch (IOException e) {
            e.printStackTrace();
        }
        IConverterJsonService converterJsonService = new ConverterJsonServiceImp();
        Apartament apartament = converterJsonService.convertApartamentFromJson(roomJson);
        return apartament;
    }

    @Override
    public Polygon setCoordinateToPolygon(Room room) {
        ISeparateRoomService separateRoomService = new SeparateRoomServiceImp();
        java.util.List<Integer> coordX = separateRoomService.getRoomCoordinateX(room);
        int xPoly[] = new int[coordX.size()];
        for (int i = 0; i < coordX.size() ; i++) {
            xPoly[i] = coordX.get(i);
        }

        List<Integer> coordY = separateRoomService.getRoomCoordinateY(room);
        int yPoly[] = new int[coordY.size()];
        for (int i = 0; i < coordY.size() ; i++) {
            yPoly[i] = coordY.get(i);
        }
        Polygon polygon = new Polygon(xPoly, yPoly, xPoly.length);

        return polygon;
    }
}
