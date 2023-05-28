package model.repository;

import model.entity.Laptop;

import java.util.ArrayList;
import java.util.List;

public class LaptopDAO implements InterfaceDAO {
    List<Laptop> laptops = new ArrayList<>();

    @Override
    public void save(Laptop laptop) {
        laptops.add(laptop);
    }
}
