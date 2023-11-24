package com.docker.nosql.controller;

import com.docker.nosql.request.RedisSetCreate;
import com.docker.nosql.service.RedisTemplateHelper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/redis")
@RestController
public class MyRedisController {
    private final RedisTemplateHelper redisTemplateHelper;

    @PostMapping("/string")
    public ResponseEntity<String> setValue(@RequestBody RedisSetCreate dto) {
        log.info("[got called] = {}",dto);
        redisTemplateHelper.setValue((String) dto.getKey(),(String) dto.getValue());
        return ResponseEntity.ok("good");
    }
    @GetMapping("/string/{key}")
    public ResponseEntity<String> getValue(@PathVariable String key) {
        String response = redisTemplateHelper.getValue(key);
        return ResponseEntity.ok(response);
    }

    // List 데이터 getter/setter
    public Long addToListFromRight(String key, String value) {
        return null;
    }
    public Long addToListFromLeft(String key, String value) {
        return null;
    }
    public String getFromList(String key, int index) {
        return null;
    }

    public List<String> getRangeFromList(String key, int start, int end) {
        return null;
    }

    // Set 데이터 getter/setter

    public Long addToSet(String key, String... values) {
        return null;
    }

    public Set<String> getFromSet(String key) {
        return null;
    }

    // Hash 데이터 getter/setter

    public void addToHash(String key, String hashKey, String value) {

        return;
    }

    public String getFromHash(String key, String hashKey) {
        return null;
    }
}
