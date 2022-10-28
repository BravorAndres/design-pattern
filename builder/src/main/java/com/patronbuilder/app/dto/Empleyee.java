package com.patronbuilder.app.dto;

import java.util.ArrayList;
import java.util.List;

import com.patronbuilder.app.IBuilder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor
public class Empleyee {

    private StringBuilder name;
    private int age;
    private Addres addres;
    private StringBuilder gender;
    private List<Phone>phones;
    private List<Contact>Contacts;

    private Empleyee(StringBuilder name,int age,StringBuilder gender,Addres addres,List<Phone> phones,List<Contact> contacts){
        this.Contacts = contacts;
        this.phones = phones;
        this.addres = addres;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Empleyee(StringBuilder name, int age,StringBuilder gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static class EmpleyeeBuilder implements IBuilder<Empleyee>{

        private StringBuilder name;
        private int age;
        private StringBuilder gender;
        private Addres addres;
        private final List<Phone> phones = new ArrayList<>();
        private final List<Contact> contacts = new ArrayList<>();

        public EmpleyeeBuilder(){}

        public EmpleyeeBuilder setName(StringBuilder name){
            this.name = name;
            return this;
        }

        public EmpleyeeBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public EmpleyeeBuilder setGender(StringBuilder gender){
            this.gender = gender;
            return this;
        }

        public EmpleyeeBuilder setAdress(StringBuilder adress,StringBuilder city,StringBuilder country, StringBuilder cp){
            addres = new Addres(adress, city, country, cp);
            return this;
        }

        public EmpleyeeBuilder addPhones(StringBuilder phoneNumaber,StringBuilder ext,StringBuilder phoneType){
            phones.add(new Phone(phoneNumaber, ext, phoneType));
            return this;
        }

        public EmpleyeeBuilder addContacts(StringBuilder name,StringBuilder phoneNumbre,StringBuilder ext,StringBuilder phoneType,StringBuilder address,StringBuilder city,StringBuilder country,StringBuilder cp){
            contacts.add(new Contact(name, new Phone(phoneNumbre, ext, phoneType),new Addres(address, city, country, cp)));
            return this;
        }

        public EmpleyeeBuilder addContacts(StringBuilder name,StringBuilder phoneNumber,StringBuilder ext,StringBuilder phoneType){
            contacts.add(new Contact(name, new Phone(phoneNumber, ext, phoneType)));
            return this;
        }

        @Override
        public Empleyee build() {
            
            return new Empleyee(name,age,gender,addres,phones,contacts);
        }
        
    }
}


