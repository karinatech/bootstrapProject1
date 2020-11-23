package com.cybertek.entity;

import com.cybertek.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity{
    private String firstName;
    private String lastNamee;
    private String userNamae;
    private String paasword;
    private boolean enabled;
    private String phone;
    private Role role;
    private Gender gender;

    public User(String firstName, String lastNamee, String userNamae, String paasword, boolean enabled, String phone, Role role, Gender gender) {
        this.firstName = firstName;
        this.lastNamee = lastNamee;
        this.userNamae = userNamae;
        this.paasword = paasword;
        this.enabled = enabled;
        this.phone = phone;
        this.role = role;
        this.gender = gender;
    }
}
