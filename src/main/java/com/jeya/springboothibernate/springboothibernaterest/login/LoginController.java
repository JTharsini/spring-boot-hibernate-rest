package com.jeya.springboothibernate.springboothibernaterest.login;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logins")
public class LoginController
{
  @Resource(name = "loginService")
  private LoginService loginService;

  @GetMapping("/login/{id}")
  public LoginData getLogin(@PathVariable Long id)
  {
    return loginService.getLoginById(id);
  }

  @PostMapping("/login")
  public LoginData saveLogin(final @RequestBody LoginData loginData)
  {
    return loginService.saveLogin(loginData);
  }

  @DeleteMapping("/login/{id}")
  public Boolean deleteLogin(@PathVariable Long id)
  {
    return loginService.deleteLogin(id);
  }
}
