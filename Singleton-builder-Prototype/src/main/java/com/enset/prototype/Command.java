package com.enset.prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Command implements Cloneable{
    private Long id;
    private Long billNum;
    private Date commandDate;
    private List<String> productsList=new ArrayList<>();

    public Command(Long id, Long billNum, Date commandDate, List<String> productsList) {
        this.id = id;
        this.billNum = billNum;
        this.commandDate = commandDate;
        this.productsList = productsList;
    }

    public Command() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBillNum() {
        return billNum;
    }

    public void setBillNum(Long billNum) {
        this.billNum = billNum;
    }

    public Date getCommandDate() {
        return commandDate;
    }

    public void setCommandDate(Date commandDate) {
        this.commandDate = commandDate;
    }

    public List<String> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<String> productsList) {
        this.productsList = productsList;
    }
    public Command commandClone() throws CloneNotSupportedException {
        Command newCommand=(Command) this.clone();
        return newCommand;
    }

    @Override
    public String toString() {
        return "Command{" +
                "id=" + id +
                ", billNum=" + billNum +
                ", commandDate=" + commandDate +
                ", productsList=" + productsList +
                '}';
    }
}
