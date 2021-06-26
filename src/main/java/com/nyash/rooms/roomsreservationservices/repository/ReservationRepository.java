package com.nyash.rooms.roomsreservationservices.repository;

import com.nyash.rooms.roomsreservationservices.entity.ReservationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {
    List<ReservationEntity> findByDate(Date date);
}
