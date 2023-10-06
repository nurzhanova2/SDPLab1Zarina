package com.journaldev.design.abstractfactory;

import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;

//  реализующий интерфейс ComputerAbstractFactory
public class PCFactory implements ComputerAbstractFactory {

    // поля для хранения информации о RAM, HDD и CPU ПК
    private String ram;
    private String hdd;
    private String cpu;

    // Конструктор класса PCFactory, принимающий параметры RAM, HDD и CPU при создании объекта
    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // Метод createComputer, реализованный из интерфейса ComputerAbstractFactory,
    // создает объект класса PC с заданными характеристиками RAM, HDD и CPU
    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}