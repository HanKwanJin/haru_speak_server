package com.example.be.core.application.dto.response;

import com.example.be.core.domain.speakinglog.SpeakingLogType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
public class SpeakingLogsResponse {

	@Schema(enumAsRef = true, description = "스피킹 로그 조회 타입, NOT NULL")
	@NotNull
	private final SpeakingLogType type;

	private final List<SpeakingLogResponse> speakingLogResponses;

	public SpeakingLogsResponse(SpeakingLogType type,
		List<SpeakingLogResponse> speakingLogResponses) {
		this.type = type;
		this.speakingLogResponses = speakingLogResponses;
	}
}
