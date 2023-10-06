package com.journaldev.design.abstractfactory;

import com.journaldev.design.model.Computer;

// Интерфейс ComputerAbstractFactory
public interface ComputerAbstractFactory {

    // Абстрактный метод createComputer для создания объектов класса Computer
    public Computer createComputer();
}
