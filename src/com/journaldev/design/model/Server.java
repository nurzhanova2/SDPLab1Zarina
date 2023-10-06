package com.journaldev.design.model;

// класс который расширяет абстрактный класс Computer (Компьютер)
public class Server extends Computer {

    // поля для хранения информации о RAM, HDD и CPU сервера
    private String ram;
    private String hdd;
    private String cpu;

    // конструктор  принимающий параметры RAM, HDD и CPU при создании объекта
    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // методы для получения информации о RAM, HDD и CPU
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
