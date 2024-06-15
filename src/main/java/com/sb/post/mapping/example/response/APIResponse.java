package com.sb.post.mapping.example.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder(toBuilder = true)
public class APIResponse {
    private int errorCode;
    private Object data;
}
