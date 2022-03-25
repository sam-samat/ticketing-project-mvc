package com.cydeo.dto;

import com.cydeo.entity.Role;
import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private Boolean enabled;
    private String phone;
    private RoleDTO role;
    private Gender gender;
}
