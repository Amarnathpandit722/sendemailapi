package com.send.email.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.send.email.api.services.GmailService;

/*
 * @RestController
 * 
 * @RequestMapping("/api/v1/email") public class EmailController {
 * 
 * @Autowired private GmailService gmailService;
 * 
 * @PostMapping("/send") public String sendEmail(@RequestParam String
 * to, @RequestParam String subject, @RequestParam String body) { try {
 * gmailService.sendEmail(to, subject, body); return "Email sent successfully!";
 * } catch (Exception e) { e.printStackTrace(); return "Failed to send email: "
 * + e.getMessage(); } } }
 *
 *
 */





@RestController
public class EmailController {

    @GetMapping("")
    public ModelAndView composeEmail() {
        // Hardcoded email details
        String recipient = "amarnathpandit722@gmail.com";
        String subject = "Your Subject Here";
        String body = "This is the pre-filled email body.";

        // Generate the mailto link
        String mailtoLink = String.format("mailto:%s?subject=%s&body=%s",
                recipient, 
                encodeURIComponent(subject), 
                encodeURIComponent(body));

        // Redirect to the mailto link
        return new ModelAndView("redirect:" + mailtoLink);
    }

    // Utility method to URL-encode parameters
    private String encodeURIComponent(String value) {
        try {
            return java.net.URLEncoder.encode(value, "UTF-8")
                    .replace("+", "%20");
        } catch (Exception e) {
            return value;
        }
    }
}