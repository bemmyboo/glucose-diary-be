package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.BookDoctor;

@Repository
public interface BookDoctorRepository extends JpaRepository<BookDoctor, Long> {

}