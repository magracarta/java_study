package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Phone extends Product{
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem; //운영 체제
    public Phone(String cpu, int hdd, int ram, String operationSystem){
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("phone 클래스의 모든 필드를 초기화 하는 생성자");
        
    }

    public Phone(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("phone 클래스의 모든 필드를 초기화 하는 생성자");
    }
    public String getCpu(){
        return cpu;
    }
    public int getHdd(){
        return hdd;
    }
    public int getRam(){
        return ram;
    }

    public void setCpu(String cpu){
        this.cpu = cpu;
    }
    public void setHdd(int hdd){
        this.hdd = hdd;
    }
    public void setRam(int ram){
        this.ram = ram;
    }


    @Override
    public String getInformation(){
        return super.getInformation()
        + "sdd";
    }


}
