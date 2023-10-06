package com.journaldev.design.factory;

import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;
import com.journaldev.design.model.Server;

// для создания объектов типа Computer
public class ComputerFactory {

    // cтатический метод getComputer, который принимает тип компьютера, RAM, HDD и CPU
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        // eсли тип компьютера - "PC", создать объект класса PC и вернуть его
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        }
        // eсли тип компьютера - "Server", создать объект класса Server и вернуть его
        else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        // eсли тип компьютера не распознан, вернуть null
        return null;
    }
}
