package ru.itis;


import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Console Console = ru.itis.Console.builder()
                .firm("Samsung")
                .manufacturer("Jdfdf")
                .name("fdfdsf")
                .serialNumber("123")
                .termOfService("24.03.2019")
                .build();
        Television tv = Television.getTelevision();
        tv.addChannel(new Channel("ABC"));
        tv.tvChannel[0].addBroadcast(new Broadcast("Once upon a time", LocalTime.parse("00:00:01"), LocalTime.parse("06:00:00")));
        tv.tvChannel[0].addBroadcast(new Broadcast("Simpsons", LocalTime.parse("06:00:01"), LocalTime.parse("12:00:00")));
        tv.tvChannel[0].addBroadcast(new Broadcast("Once upon a wonderland", LocalTime.parse("12:00:01"),LocalTime.parse("18:00:00")));
        tv.tvChannel[0].addBroadcast(new Broadcast("Blah-blah", LocalTime.parse("18:00:01"), LocalTime.parse("23:59:59")));
        tv.addChannel(new Channel("CBS"));
        tv.tvChannel[1].addBroadcast(new Broadcast("News", LocalTime.parse("00:00:01"), LocalTime.parse("06:00:00")));
        tv.tvChannel[1].addBroadcast(new Broadcast("Wonders", LocalTime.parse("06:00:01"), LocalTime.parse("12:00:00")));
        tv.tvChannel[1].addBroadcast(new Broadcast ("Sports", LocalTime.parse("12:00:01"), LocalTime.parse("18:00:00")));
        tv.tvChannel[1].addBroadcast(new Broadcast("News of the hour", LocalTime.parse("18:00:01"), LocalTime.parse("23:59:59")));
        tv.addChannel(new Channel("2x2"));
        tv.tvChannel[2].addBroadcast(new Broadcast("Johnny Cash", LocalTime.parse("00:00:01"), LocalTime.parse("06:00:00")));
        tv.tvChannel[2].addBroadcast(new Broadcast("Pokemon", LocalTime.parse("06:00:01"), LocalTime.parse("12:00:00")));
        tv.tvChannel[2].addBroadcast(new Broadcast("King of the mountain", LocalTime.parse("12:00:01"), LocalTime.parse("18:00:00")));
        tv.tvChannel[2].addBroadcast(new Broadcast("Family guy", LocalTime.parse("18:00:01"), LocalTime.parse("23:59:59")));

        Console.changeChannel("ABC");
        Console.changeChannel("2x2");
        Console.changeChannel("CBS");

    }
}



