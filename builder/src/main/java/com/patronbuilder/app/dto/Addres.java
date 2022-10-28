package com.patronbuilder.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Addres {
    
    private StringBuilder addres;
    private StringBuilder city;
    private StringBuilder country;
    private StringBuilder cp;
}
