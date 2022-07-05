package com.web.personalweb.web.model.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    Integer id;
    String username;
    String skill;
    String about;
    String major;
    String institution;
    String images;
}
