package com.application.rest.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
	private String id;
	private String message;
	@Builder.Default private long date = Instant.now().getEpochSecond();
}
