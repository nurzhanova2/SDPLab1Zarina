package com.journaldev.design.abstractfactory;

import com.journaldev.design.model.Computer;
import com.journaldev.design.model.Server;

// реализующий интерфейс ComputerAbstractFactory
public class ServerFactory implements ComputerAbstractFactory {

    // поля для хранения информации о RAM, HDD и CPU сервера
    private String ram;
    private String hdd;
    private String cpu;

    // Конструктор класса ServerFactory, принимающий параметры RAM, HDD и CPU при создании объекта
    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // Метод createComputer, реализованный из интерфейса ComputerAbstractFactory,
    // создает объект класса Server с заданными характеристиками RAM, HDD и CPU
    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}
