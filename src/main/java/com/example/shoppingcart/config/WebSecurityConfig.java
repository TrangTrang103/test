//package com.example.shoppingcart.config;
//
//import com.example.shoppingcart.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@EnableWebSecurity
//@Configuration
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private UserService userService ;
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    //cấu hình các đường dẫn url
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/","/index", "/loginform").permitAll()
//                .and()
//                .authorizeRequests().antMatchers("/admin").hasRole("ADMIN")
//                .and()
//                .authorizeRequests().antMatchers("/hello").hasAnyRole("USER","ADMIN")
//                .and()
//                .authorizeRequests().anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .defaultSuccessUrl("/loginform").permitAll()
//                .and()
//                .logout().permitAll();
//
//        http.authorizeRequests().and().formLogin()//
//                .loginProcessingUrl("spring_security_check") // Submit URL
//                .loginPage("/loginform")//
//                .usernameParameter("username")//
//                .passwordParameter("password");
//
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
//
//    }
//}
