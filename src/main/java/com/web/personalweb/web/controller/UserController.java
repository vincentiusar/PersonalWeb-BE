package com.web.personalweb.web.controller;

import com.web.personalweb.entity.User;
import com.web.personalweb.service.UserService;
import com.web.personalweb.web.model.Response;
import com.web.personalweb.web.model.user.UserResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Response<UserResponse> getUserById(@PathVariable Integer id) {
        User user = userService.getUser(id);

        return Response.<UserResponse>builder()
                .status(HttpStatus.OK.value())
                .data(user == null ? null : toResponse(user))
                .build();
    }

    private UserResponse toResponse(User user){
        UserResponse userResponse = UserResponse.builder().build();
        BeanUtils.copyProperties(user, userResponse);
        return userResponse;
    }
}
