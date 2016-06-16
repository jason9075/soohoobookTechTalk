package com.jason9075.soohoobooktechtalk.model;

import com.jason9075.soohoobooktechtalk.exception.WrongWearingException;

/**
 * Created by jason9075 on 2016/6/16.
 */

public class MyCharacter {
    // required field
    private String name;

    // optional field
    private String head;
    private String body;
    private String pants;
    private String dress;
    private String arm;
    private String shoes;

    public static class Builder {
        // required field
        private String name;

        // optional field
        private String head;
        private String body;
        private String pants;
        private String dress;
        private String arm;
        private String shoes;

        public Builder(String name) {
            this.name = name;
        }

        // set
        public Builder wearHead(String head) {
            this.head = head;
            return this;
        }

        public Builder wearBody(String body) {
            this.body = body;
            return this;
        }

        public Builder wearPants(String pants) {
            this.pants = pants;
            return this;
        }

        public Builder wearDress(String dress) {
            this.dress = dress;
            return this;
        }

        public Builder wearArm(String arm) {
            this.arm = arm;
            return this;
        }

        public Builder wearShoes(String shoes) {
            this.shoes = shoes;
            return this;
        }

        // build
        public MyCharacter build() throws WrongWearingException {
            if(this.dress != null && this.body != null)
                throw new WrongWearingException(">>>同時穿著dress和body");
            return new MyCharacter(this);
        }
    }

    private MyCharacter(Builder builder){
        this.name = builder.name;
        this.head = builder.head;
        this.body = builder.body;
        this.pants = builder.pants;
        this.dress = builder.dress;
        this.arm = builder.arm;
        this.shoes = builder.shoes;
    }

    @Override
    public String toString() {
        return name + "穿著：{" +
                "  head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", pants='" + pants + '\'' +
                ", dress='" + dress + '\'' +
                ", arm='" + arm + '\'' +
                ", shoes='" + shoes + '\'' +
                '}';
    }
}
