package com.api.parkingcontrol.models;

import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_PARKING_SPOT")
@RequiredArgsConstructor
public class ParkingSpotModel implements Serializable {

    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



}
