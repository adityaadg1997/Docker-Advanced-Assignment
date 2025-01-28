package com.nagarro.Docker.Assignment.Advanced.response;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {

    public String message;
    public boolean status;

}
