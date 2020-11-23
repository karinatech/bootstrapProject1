package com.cybertek.bootstrap;

import com.cybertek.dto.RoleDTO;
import com.cybertek.dto.UserDTO;
import com.cybertek.enums.Gender;
import com.cybertek.implementations.RoleServiceImpl;
import com.cybertek.service.RoleService;
import com.cybertek.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DataGenerator implements CommandLineRunner {

    RoleService role;
    UserService user;


    public DataGenerator(RoleService role, UserService user) {
        this.role = role;
        this.user = user;
    }

    @Override
    public void run(String... args) throws Exception {
        RoleDTO adminRole = new RoleDTO(1L,"Admin");
        RoleDTO managerRole = new RoleDTO(2L,"Manager");
        RoleDTO employeeRole = new RoleDTO(3L,"Employee");
role.save(adminRole);
role.save(managerRole);
role.save(employeeRole);
        UserDTO user1 = new UserDTO("John", "Kesy",
                "admin@cybertek.com", "abc", true, "7459684532", adminRole, Gender.MALE);
        UserDTO user5 = new UserDTO("John", "Kesy",
                "admin2@cybertek.com", "abc", true, "7459684532", adminRole, Gender.MALE);
        UserDTO user2 = new UserDTO("Delisa",
                "Norre", "T001@cybertek.com", "123", true, "8567412358", managerRole, Gender.FEMALE);
        UserDTO user3 = new UserDTO("Craig", "Jark",
                "P001@cybertek.com", "123", true, "7777775566", employeeRole, Gender.MALE);
        UserDTO user4 = new UserDTO("Shaun",
                "Hayns", "S001@cybertek.com", "123", true, "3256987412", employeeRole, Gender.MALE);
user.save(user1);
user.save(user2);
user.save(user3);
user.save(user4);
user.save(user5);

    }
}
