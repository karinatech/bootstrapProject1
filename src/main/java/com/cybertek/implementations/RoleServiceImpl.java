package com.cybertek.implementations;

import com.cybertek.dto.RoleDTO;
import com.cybertek.service.RoleService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class RoleServiceImpl extends AbstractMapService<RoleDTO,Long> implements RoleService {
    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public RoleDTO findById(Long id) {
        return super.findById(id);
    }

    @Override
    public RoleDTO save(RoleDTO user) {
        return super.save(user.getId(),user);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(RoleDTO user) {
        super.delete(user);
    }
}
