package com.example.pmfbackend.Service;

import com.example.pmfbackend.Controller.EinnahmenController;
import com.example.pmfbackend.Entity.Einnahmen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FinanzenService {

    @Autowired
    EinnahmenController einnahmenController;

    public FinanzenService() {
    }
}
