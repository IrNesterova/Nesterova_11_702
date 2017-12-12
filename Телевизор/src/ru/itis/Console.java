package ru.itis;

import java.time.LocalTime;

public class Console {
    private String serialNumber;
    private String name;
    private String firm;
    private String manufacturer;
    private String termOfService;
    private Television tv = Television.getTelevision();
    public Console (Builder builder) {
        this.serialNumber = builder.serialNumber;
        this.name = builder.name;
        this.firm = builder.firm;
        this.manufacturer = builder.manufacturer;
        this.termOfService = builder.termOfService;
    }
    public static Builder builder(){
        return new Builder();
    }
    public static class Builder {
        private String serialNumber;
        private String name;
        private String firm;
        private String manufacturer;
        private String termOfService;

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder firm(String firm) {
            this.firm = firm;
            return this;
        }

        public Builder manufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder termOfService(String termOfService) {
            this.termOfService = termOfService;
            return this;
        }

        public Console build() {
            return new Console(this);
        }
    }

    public String getFirm() {
        return firm;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getTermOfService() {
        return termOfService;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public void changeChannel(String name){
        for (int i = 0; i < tv.channelCount; i++){
            if (tv.tvChannel[i].getName().equals(name)) {
                for (int j = 0; j < tv.tvChannel[i].broadcastCount; j++) {
                    if (LocalTime.now().isBefore(tv.tvChannel[i].tvBroadcast[j].getFinishTime()) && LocalTime.now().isAfter(tv.tvChannel[i].tvBroadcast[j].getBeginTime())) {
                        Television.getTelevision().log(tv.tvChannel[i].getName(), tv.tvChannel[i].tvBroadcast[j].getBroadcastName());
                        break;
                    }
                }
            }
        }
    }
}


