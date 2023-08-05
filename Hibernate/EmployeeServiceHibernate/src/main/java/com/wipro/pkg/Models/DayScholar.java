package com.wipro.pkg.Models;

import javax.persistence.*;


@Entity
@DiscriminatorValue("DS")
public class DayScholar extends Student {

    private String lockerId;
    public DayScholar() {

        super();

        // TODO Auto-generated constructor stub

    }


    public DayScholar(Long id, String name, String studentClass) {

        super(id, name, studentClass);

        // TODO Auto-generated constructor stub

    }


    public DayScholar(String lockerId) {

        super();

        this.lockerId = lockerId;

    }


    public String getLockerId() {

        return lockerId;

    }


    public void setLockerId(String lockerId) {

        this.lockerId = lockerId;

    }
    @Override
    public String toString() {
        return super.toString() + ", DayScholar [lockerId=" + lockerId + "]";
    }


}


