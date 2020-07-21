package com.changgou.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gongyunkao
 * @Title:
 * @Description:
 * @date 2020年07月21日
 */
@RestController
@CrossOrigin//跨域 域名或者请求端口或者协议不一致的时候就会发生跨域
@RequestMapping(value = "/brand")
public class BrandController {
}
