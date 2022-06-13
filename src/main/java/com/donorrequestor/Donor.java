package com.donorrequestor;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


@RestController
@EnableAutoConfiguration
public class Donor
{
@RequestMapping("/test")
public String test()
{
return "Hello World";
}

}