package project.backend.domain.consumer.dto;

import lombok.Builder;
import lombok.Getter;
import project.backend.domain.consumer.entity.ConsumerInfo;

@Builder
@Getter
public class ConsumerResponseDto {

    private ConsumerInfo consumerInfo;
    private Integer status;
    private String message;

}
