package com.tiscon.dto;

public class UserOrderDto {

    private String customerName;

    private String tel;

    private String email;

    private String oldPrefectureId;

    private String oldAddress;

    private String newPrefectureId;

    private String newAddress;

    private String sample;

    private String box;

    private String bed;

    private String bicycle;

    private String shelf;

    private String bookshelf;

    private String table;

    private String refrigerator;

    private String telev;

    private String washingMachine;

    private boolean washingMachineInstallation;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public int getSample() {
        return Integer.parseInt(sample);
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public int getBox() {
        return Integer.parseInt(box);
    }

    public void setBox(String box) {
        this.box = box;
    }

    public int getBed() {
        return Integer.parseInt(bed);
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public int getBicycle() {
        return Integer.parseInt(bicycle);
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public int getShelf() {
        return Integer.parseInt(shelf);
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public int getBookshelf() {
        return Integer.parseInt(bookshelf);
    }

    public void setBookshelf(String bookshelf) {
        this.bookshelf = bookshelf;
    }

    public int getTable() {
        return Integer.parseInt(table);
    }

    public void setTable(String table) {
        this.table = table;
    }

    public int getRefrigerator() {
        return Integer.parseInt(refrigerator);
    }

    public void setRefrigerator(String refrigerator) {
        this.refrigerator = refrigerator;
    }

    public int getTelev() {
        return Integer.parseInt(telev);
    }

    public void setTelev(String telev) {
        this.telev = telev;
    }

    public int getWashingMachine() {
        return Integer.parseInt(washingMachine);
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean getWashingMachineInstallation() {
        return washingMachineInstallation;
    }

    public void setWashingMachineInstallation(Boolean washingMachineInstallation) {
        this.washingMachineInstallation = washingMachineInstallation;
    }
}
