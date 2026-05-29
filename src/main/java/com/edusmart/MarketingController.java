package com.edusmart.plataforma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/edusmart")
public class MarketingController {

    @Autowired
    private EduSmartAIService aiService;

    @GetMapping("/publicidad")
    public String obtenerPublicidad(
            @RequestParam String tema,
            @RequestParam String audiencia) {
        return aiService.generarPublicidad(tema, audiencia);
    }
}