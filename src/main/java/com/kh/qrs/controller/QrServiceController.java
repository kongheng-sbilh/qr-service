package com.kh.qrs.controller;

import com.kh.qrs.service.QRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class QrServiceController {

    @Autowired
    private QRService qrService;

    @GetMapping("/qr-generate")
    public ResponseEntity<byte[]> generateQRCode(@RequestParam String text) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_PNG);
            return ResponseEntity.ok()
                .headers(headers)
                .body(qrService.generate(text, 250, 250));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }

}
