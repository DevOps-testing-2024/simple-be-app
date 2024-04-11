package com.simple.app.repository.jpa;

import com.simple.app.repository.jpa.entity.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DescriptionRepository extends JpaRepository<Description, Long> {

    @Query("SELECT description FROM Description description ORDER BY description.id ASC")
    List<Description> findAllOrderById();
}
