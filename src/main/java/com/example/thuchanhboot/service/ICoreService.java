package com.example.thuchanhboot.service;

import java.util.List;

public interface ICoreService<E>{
    void save(E e);
    void delete(Long id);
    List<E> findAll();
    E findById(Long id);
}
