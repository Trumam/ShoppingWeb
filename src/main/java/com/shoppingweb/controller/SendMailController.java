package com.shoppingweb.controller;

import com.shoppingweb.common.Result;
import com.shoppingweb.entity.Order;
import com.shoppingweb.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import org.springframework.web.bind.annotation.*;
/**
 * 测试邮件发送
 * @author qzz
 */
@CrossOrigin
@RestController
@RequestMapping("/mail")
public class SendMailController {

    @Autowired
    private MailService mailService;
    private String VerificationCode;

    /**
     * 发送文本邮件
     * @param to
     * @param subject
     * @param text
     */
    @RequestMapping("/sendTextMail")
    public void sendTextMail(String to,String subject,String text){
        mailService.sendTextMailMessage(to,subject,text);
    }

    @PostMapping("/sendVerificationCode")
    public Result sendVerificationCode(@RequestBody Order order){
        String to = order.getCus_account();
        String subject = "VerificationCode";
        int firstDigit = new Random().nextInt(1, 10);
        int remainingDigits = 0;
        for (int i = 0; i < 3; i++) {
            remainingDigits += Math.floor(Math.random() * 10);
        }
        int code = firstDigit * 1000 + remainingDigits;
        VerificationCode = String.valueOf(code);

        String text = "Your VerificationCode is "+VerificationCode;
        mailService.sendTextMailMessage(to,subject,text);
        return Result.success(VerificationCode);
    }
}