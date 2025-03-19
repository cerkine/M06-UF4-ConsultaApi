package com.m06.uf4.consultar.api.app;

import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@CrossOrigin("*")
@RequestMapping("/api/v1/emojis")
@RestController
public class EmojisRestController {

    private final HashMap<String, String> emojisUpgrade = new HashMap<>();

    @PostConstruct
    public void loadEmojisOnHashMap() {

        //Linea evolutiva de agua
        emojisUpgrade.put("💧", "🥛");
        emojisUpgrade.put("🥛", "🚰");
        emojisUpgrade.put("🚰", "🚚");
        emojisUpgrade.put("🚚", "🏭");
        emojisUpgrade.put("🏭", "🚂");
        emojisUpgrade.put("🚂", "🚢");
        emojisUpgrade.put("🚢", "🌎");
        emojisUpgrade.put("🌎", "🚀");
        emojisUpgrade.put("🚀", "🪐");
        emojisUpgrade.put("🪐", "🌌");
        emojisUpgrade.put("🌌", "🧬");
        emojisUpgrade.put("🧬", "🤖");
        emojisUpgrade.put("🤖", "🧠");

        //Linea evolutiva de fuego
        emojisUpgrade.put("🔥", "🍳");
        emojisUpgrade.put("🍳", "🥓");
        emojisUpgrade.put("🥓", "🍔");
        emojisUpgrade.put("🍔", "🍕");  
        emojisUpgrade.put("🍕", "🌭"); 
        emojisUpgrade.put("🌭", "🍖");  
        emojisUpgrade.put("🍖", "🍲"); 
        emojisUpgrade.put("🍲", "🍱");  
        emojisUpgrade.put("🍱", "🥘");  
        emojisUpgrade.put("🥘", "🍽️"); 
        emojisUpgrade.put("🍽️", "🎉");  
        emojisUpgrade.put("🎉", "🍻");  
        emojisUpgrade.put("🍻", "🎆"); 
    }

    @GetMapping
    public ResponseEntity<String> getIcon(@RequestParam String emoji) {
        return ResponseEntity.ok(emojiUpgrade(emoji));
    }

    private String emojiUpgrade(String emoji) {
        return emojisUpgrade.get(emoji);
    }

}
