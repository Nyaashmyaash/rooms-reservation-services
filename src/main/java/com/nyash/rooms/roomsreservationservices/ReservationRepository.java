package com.nyash.rooms.roomsreservationservices;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {
    List<Reservation> findByDate(Date date);
}
