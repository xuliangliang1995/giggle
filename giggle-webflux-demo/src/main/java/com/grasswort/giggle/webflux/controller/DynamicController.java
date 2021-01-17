package com.grasswort.giggle.webflux.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dynamic")
public class DynamicController {

    @PostMapping
    public String submit(@RequestBody Form form) {
        System.out.println(form);
        return "SUCCESS";
    }


    public static class Form {
        private Integer type;

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Form{" +
                    "type=" + type +
                    '}';
        }
    }

    public static class Form1 extends Form {
        private String name;
        private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Form1{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }

    public static class Form2 extends Form {
        private String idCard;

        public String getIdCard() {
            return idCard;
        }

        public void setIdCard(String idCard) {
            this.idCard = idCard;
        }

        @Override
        public String toString() {
            return "Form2{" +
                    "idCard='" + idCard + '\'' +
                    '}';
        }
    }
}
