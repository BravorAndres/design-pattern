package com.patronbuilder.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Phone {
    private StringBuilder phoneNumber;
    private StringBuilder ext;
    private StringBuilder phoneType;
}
