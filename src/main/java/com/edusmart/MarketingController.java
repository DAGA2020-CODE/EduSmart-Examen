package com.edusmart.plataforma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/edusmart")
public class MarketingController {

    @Autowired
    private com.edusmart.plataforma.EduSmartAIService aiService;

    @GetMapping("/publicidad")
    public String obtenerPublicidad(
            @RequestParam("tema") String tema,
            @RequestParam("audiencia") String audiencia) {
        return aiService.generarPublicidad(tema, audiencia);
    }
}