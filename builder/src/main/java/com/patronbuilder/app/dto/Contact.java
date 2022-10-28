package com.patronbuilder.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Contact {
    
    private StringBuilder name;
    private Phone phone;
    private Addres addres;

    public Contact(StringBuilder name,Phone phone){
        this.name = name;
        this.phone = phone;
    }
}
