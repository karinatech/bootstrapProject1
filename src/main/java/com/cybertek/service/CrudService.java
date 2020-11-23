package com.cybertek.service;

import java.util.List;

public interface CrudService <T,ID>{
    List<T>findAll();
    T findById(ID id);
    T save(T user);
    void deleteById(ID id);
    void delete(T user);




}
