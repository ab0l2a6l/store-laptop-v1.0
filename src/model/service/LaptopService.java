package model.service;

import model.entity.Laptop;
import model.repository.InterfaceDAO;
import model.repository.LaptopDAO;

public class LaptopService implements InterfaceService {
    public void sentDataTpDB(Laptop laptop) {
        InterfaceDAO laptopDAO = new LaptopDAO();
        laptopDAO.save(laptop);
    }

    public int findById(long id) {
        InterfaceDAO interfaceDAO = new LaptopDAO();

        for (Laptop laptops : interfaceDAO.getLaptops()) {
            if (laptops.getId() == id) {
                return 1;
            }
        }
        return 0;
    }
}
