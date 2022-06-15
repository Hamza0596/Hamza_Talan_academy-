package com.talan.food.services;
import java.util.List;
import com.talan.food.dto.ReservationDto;

public interface ReservationService {

	public List<ReservationDto> getAllReservation();
	public ReservationDto getReservationById(Long Id);
	public ReservationDto addReservation(ReservationDto reservationDto);
	public ReservationDto editReservation(ReservationDto reservationDto);
	public void deleteReservationById(Long id);
	public List<ReservationDto> getReservationByUserId(Long Id);
	public ReservationDto confirmReservation(ReservationDto reservationDto);
	
	
	
}
