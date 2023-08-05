package com.wipro.pkg.Models;

import javax.persistence.*;



@Entity

@DiscriminatorValue("HS")

public class Hostelier extends Student {

    private String roomNo;



    public Hostelier() {

        super();

        // TODO Auto-generated constructor stub

    }



    public Hostelier(Long id, String name, String studentClass) {

        super(id, name, studentClass);

        // TODO Auto-generated constructor stub

    }



    public Hostelier(String roomNo) {

        super();

        this.roomNo = roomNo;

    }



    public String getRoomNo() {

        return roomNo;

    }



    public void setRoomNo(String roomNo) {

        this.roomNo = roomNo;

    }



    @Override

    public String toString() {
        super.toString();
        return "Hostelier [roomNo=" + roomNo + "]";

    }







}
