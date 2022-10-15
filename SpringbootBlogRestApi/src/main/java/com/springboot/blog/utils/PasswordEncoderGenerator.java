package com.springboot.blog.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderGenerator {

    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // System.out.println(passwordEncoder.encode("123"));
        //System.out.println(passwordEncoder.encode("321"));
       // System.out.println(passwordEncoder.encode("password"));
        System.out.println(passwordEncoder.encode("admin"));


        // password 123 : $2a$10$95efD1GCDzoelZI2N0noi.RF/XPNbvfSfzURjjRG1X9/mBPnrqHN2
        // password 321 : $2a$10$FPCXPm/jNYAtNm5c4VptHOIeuZw94ESqg6e28.edLAvvjwmQrhkmG

        // password password : $2a$10$YDzmi1ZzNz7qVdtV145xdOaqEtlOC/lCEnC8BLydcAGz6SrCwh6j.
        // password admin : $2a$10$5E9FMggBunk7ZfXg.qL6te0kOBK7We10kzoAsbsYtv7ZC9qYYcExG

    }
}
