package com.example.minitestmd5.service.general;


import java.util.List;
import java.util.Optional;

public interface IGeneral <T>{
    List<T> lists();
    T save(T t);
    void delete(Long id);
    Optional<T>findOne(Long id);

}
