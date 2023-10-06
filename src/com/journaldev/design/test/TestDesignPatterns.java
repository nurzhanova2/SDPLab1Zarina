package com.journaldev.design.test;
import com.journaldev.design.abstractfactory.PCFactory;
import com.journaldev.design.abstractfactory.ServerFactory;
import com.journaldev.design.model.Computer;

// Класс TestDesignPatterns для тестирования абстрактных фабрик компьютеров
public class TestDesignPatterns {
    public static void main(String[] args) {
        // Вызов метода testAbstractFactory() для тестирования абстрактной фабрики
        testAbstractFactory();
    }

    // Метод testAbstractFactory() тестирует абстрактную фабрику
    private static void testAbstractFactory() {
        // Использование абстрактной фабрики для создания объектов PC и Server с заданными характеристиками
        Computer pc = com.journaldev.design.abstractfactory.ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = com.journaldev.design.abstractfactory.ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));

        // Вывод информации о конфигурации PC и Server на экран
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}
