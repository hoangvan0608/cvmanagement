package com.bezkoder.springjwt.Service;

import com.bezkoder.springjwt.payload.request.GetListTicketRequest;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface ExportService {
    ResponseEntity<InputStreamResource> exportExcel(GetListTicketRequest getListTicketRequest) throws IOException;

}
