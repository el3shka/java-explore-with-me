package ru.practicum.User.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.practicum.User.dto.UserDtoInput;
import ru.practicum.User.dto.UserDtoOutput;
import ru.practicum.User.service.UserService;

import java.util.List;


@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/users")
public class UserControllerAdmin {
    private final UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserDtoOutput> getAllUsers(
            @RequestParam(required = false) final List<Long> ids,
            @RequestParam(defaultValue = "0") @PositiveOrZero final int from,
            @RequestParam(defaultValue = "10") @Positive final int size) {
        return userService.getAllUsers(ids, from, size);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDtoOutput createUser(@RequestBody @Valid final UserDtoInput userDtoInput) {
        return userService.createUser(userDtoInput);
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable final Long userId) {
        userService.deleteUser(userId);
    }
}
