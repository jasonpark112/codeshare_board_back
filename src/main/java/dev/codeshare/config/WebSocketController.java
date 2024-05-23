package dev.codeshare.config;

import dev.codeshare.entity.Code;
import dev.codeshare.repo.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @Autowired
    private CodeRepository codeRepository;

    @MessageMapping("/code")
    @SendTo("/topic/code")
    public String sendCode(String codeContent) {
        Code code = new Code();
        code.setContent(codeContent);
        codeRepository.save(code);
        return codeContent;
    }
}
