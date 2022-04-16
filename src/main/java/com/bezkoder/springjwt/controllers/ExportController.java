package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.Service.ExportService;
import com.bezkoder.springjwt.payload.request.GetListTicketRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ExportController {
    @Autowired
    ExportService exportService;

    @GetMapping("HO111/export")
    public ResponseEntity<InputStreamResource> exportExcel(@RequestBody GetListTicketRequest userId) throws IOException {
        return exportService.exportExcel(userId);
    }

}
