package com.selcukmeral.retry.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.selcukmeral.retry.services.RetryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/retry-service")
public class RetryController {

	private final RetryService retryService;
	  
	@GetMapping("/retry")
	public ResponseEntity retryService(@RequestParam boolean simulateRetry) {
		retryService.getRetryServiceResponse(simulateRetry);
		return ResponseEntity.ok().build();
	}
	
}
