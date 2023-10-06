package com.journaldev.design.model;

// Абстрактный класс Computer (Компьютер)
public abstract class Computer {

    // Абстрактный метод для получения объема оперативной памяти (RAM)
    public abstract String getRAM();

    // Абстрактный метод для получения объема жесткого диска (HDD)
    public abstract String getHDD();

    // Абстрактный метод для получения информации о процессоре (CPU)
    public abstract String getCPU();

    // Переопределенный метод toString для создания строкового представления объекта
    @Override
    public String toString(){
        // Возвращает строку, содержащую информацию о RAM, HDD и CPU
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}