package com.journaldev.design.test;

import com.journaldev.design.factory.ComputerFactory;
import com.journaldev.design.model.Computer;

// для тестирования фабрики компьютеров (ComputerFactory)
public class TestFactory {
    public static void main(String[] args) {
        // создание объекта PC с заданными характеристиками
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");

        // создание объекта Server с заданными характеристиками
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

        // вывод информации о конфигурации PC и Server на экран
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
