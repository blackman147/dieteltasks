package com.wimpsMobile;

import com.WimpsMobile.MobilePhone;
import com.WimpsMobile.PhoneManufacturer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobilePhoneTest {
    MobilePhone blackiePhone;
    MobilePhone joySamsung;
    MobilePhone joyHuawei;

    @BeforeEach
    void setUp() {
        blackiePhone = new MobilePhone("blackieimei", PhoneManufacturer.APPLE);
        blackiePhone.setModel("iphone 11");
        blackiePhone.setStorageSpace(512);
        blackiePhone.makeCall(1234567890);

        MobilePhone.setSimCardSlots(1);

        joySamsung = new MobilePhone("joyimei", PhoneManufacturer.SAMSUNG, "A31", 128);
        joySamsung.makeCall(987654321);

        joyHuawei = new MobilePhone("joyHuawei", PhoneManufacturer.HUAWEI, 345);
        joyHuawei.setModel("pro30");
    }

    @Test
    void showsSimCardSlots(){
        System.out.println("sim count for joys samsung is: " + joySamsung.getSimCardSlots());

    }

}