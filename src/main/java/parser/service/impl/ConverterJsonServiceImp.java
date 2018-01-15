package parser.service.impl;

import com.google.gson.Gson;
import parser.models.Apartament;

import parser.service.IConverterJsonService;


public class ConverterJsonServiceImp implements IConverterJsonService {

    @Override
    public Apartament convertApartamentFromJson(String json) {
        Gson gson = new Gson();
        Apartament apartament = gson.fromJson(json, Apartament.class);
        return apartament;
    }
}
