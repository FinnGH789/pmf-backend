//package com.example.pmfbackend.Service;
//
//import com.example.pmfbackend.Entity.Einnahmen;
//import com.example.pmfbackend.Repository.EinnahmenRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import java.util.Arrays;
//
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//class EinnahmenServiceTest {
//
//    @Autowired
//    private EinnahmenService einnahmenService;
//
//    @MockBean
//    private EinnahmenRepository einnahmenRepository;
//
//    @BeforeEach
//    void setup() {
////        Einnahmen einnahme1 = new Einnahmen(1L, "Freelance", 500);
////        Einnahmen einnahme2 = new Einnahmen(2L, "Dividende", 300);
////        Einnahmen einnahme3 = new Einnahmen(2L, "Erbe", 800);
////        Einnahmen einnahme4 = new Einnahmen(2L, "Gehalt", 600);
////        Einnahmen einnahme5 = new Einnahmen(2L, "Taschengeld", 200);
//
//        when(einnahmenRepository.findAll()).thenReturn(Arrays.asList(einnahme1, einnahme2, einnahme3, einnahme4, einnahme5));
//    }
//
//    @Test
//    public void getTotalEinnahmenTest() {
//        einnahmenService.getTotalEinnahmen();
//
//        verify(einnahmenRepository).findAll();
//    }
//}