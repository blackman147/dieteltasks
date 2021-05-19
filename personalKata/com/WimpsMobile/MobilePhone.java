package com.WimpsMobile;

public class MobilePhone {
    private String imei;
    private PhoneManufacturer make;
    private String model;
    private int storageSpace;
    private static final String INVALID_IMEI = "INVALID_IMEI";
    private static int simCardSlots;

    private MobilePhone(){
        super();
    }
    public MobilePhone(String imei){
        if (imei == ""){
            this.imei = MobilePhone.INVALID_IMEI;
        }else {
            this.imei = imei;
        }
    }

    public MobilePhone(String imeiNumber, PhoneManufacturer phoneMake){
        this(imeiNumber);
        make = phoneMake;
    }

    public MobilePhone(String imeiNumber, PhoneManufacturer phoneMake, String phoneModel){
        this(imeiNumber, phoneMake);
        model = phoneModel;
    }

    public MobilePhone(String imeiNumber, PhoneManufacturer phoneMake, int storage){
        this(imeiNumber, phoneMake );
        storageSpace = storage;
    }
    public MobilePhone(String imeiNumber, PhoneManufacturer phoneMake, String phoneModel, int storage){
        this(imeiNumber, phoneMake, phoneModel);
        storageSpace = storage;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public PhoneManufacturer getMake() {
        return make;
    }

    public void setMake(PhoneManufacturer make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }

    public static void setSimCardSlots(int simCardSlots) {
        MobilePhone.simCardSlots = simCardSlots;
    }

    public  int getSimCardSlots() {
        return simCardSlots;
    }

    public Connection makeCall(int phoneNumber){
        Connection theCall = new Connection();
        return theCall;
    }
}
