package parser.service;

import parser.models.Apartament;
import parser.models.Room;

import java.util.List;

public interface IConverterJsonService {
    public Apartament convertApartamentFromJson(String json);

}
