package com.userService.service;

import com.userService.entity.User;

public interface UserService {

	User searchByUserId(int userId);

	boolean addUser(User user);

	User loginCheck(String email, String password);

	User searchByEmail(String email);

	User topUpBalance(int userId, double topUpAmount);

	User updateBalance(int userId, double fare);
}