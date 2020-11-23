package com.cybertek.implementations;

import com.cybertek.dto.UserDTO;
import com.cybertek.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl extends AbstractMapService<UserDTO,String> implements UserService {

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public UserDTO findById(String id) {
        return super.findById(id);
    }

    @Override
    public UserDTO save(UserDTO user) {
        return super.save(user.getUserName(),user);

    }

    @Override
    public void deleteById(String id) {
    super.deleteById(id);
    }

    @Override
    public void delete(UserDTO user) {
    super.delete(user);
    }
}
