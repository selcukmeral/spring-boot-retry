package com.selcukmeral.retry.services;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import com.selcukmeral.retry.exception.CustomRuntimeException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RetryService {

	@Retryable(value = { CustomRuntimeException.class }, maxAttempts = 2, backoff = @Backoff(delay = 2000))
	public void getRetryServiceResponse(boolean simulateRetry) {

		log.debug("getRetryServiceResponse servisi çağrıldı");

		if (simulateRetry) {
			log.debug("Retry servisinden hata alındı");
			throw new CustomRuntimeException("Hata");
		}

	}

	@Recover
	public void getRetryServiceFallback(RuntimeException e,boolean simulateretry) {
		  log.debug("getRetryServiceFallback servisi çağrıldı");
	}

}