package com.example.pothole_detetction;

public class MyAnswer {

    String name,address,ans1,ans2,ans3;


    public MyAnswer() {
    }

    public MyAnswer(String name, String address, String ans1, String ans2, String ans3) {
        this.name = name;
        this.address = address;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }
}
