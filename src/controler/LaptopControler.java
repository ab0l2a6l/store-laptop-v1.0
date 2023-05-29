package controler;

import model.entity.Laptop;
import model.service.InterfaceService;
import model.service.LaptopService;

public class LaptopControler {
    public void sendDataToService(Laptop laptop) {
        InterfaceService laptopService = new LaptopService();
        laptopService.sentDataTpDB(laptop);

    }

    public int sendIdToServiceForSearch(long id) {
        InterfaceService laptopservise = new LaptopService();
        return laptopservise.findById(id);

    }
}
