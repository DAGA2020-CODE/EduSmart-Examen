package com.edusmart.plataforma;

import dev.langchain4j.service.AiService;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

@AiService
public interface EduSmartAIService {
    @UserMessage("Redacta una frase publicitaria de máximo 100 caracteres para vender un curso de {{tema}} dirigido a {{audiencia}}.")
    String generarPublicidad(@V("tema") String tema, @V("audiencia") String audiencia);
}